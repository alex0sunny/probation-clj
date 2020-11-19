(ns company.client
  (:require [clojure.edn]
            [clojure.pprint]))

(defn add-element [tag]
  (->> (.createElement js/document tag)
       (.appendChild js/document.body)))

(defn fetch-edn [uri callback]
  (-> (js/window.fetch uri)
      (.then #(.text %))
      (.then #(-> %
                  clojure.edn/read-string
                  callback))))

(defn add-button [id caption on-click]
  (let [button (add-element "button")]
    (set! (.-id button) id)
    (set! (.-textContent button) caption)
    (.addEventListener button "click" on-click)
    button))

(defn add-canvas [id]
  (let [canvas (add-element "canvas")
        style (.-style canvas)]
    (set! (.-id canvas) id)
    (set! (.-height canvas) 300)
    (set! (.-width canvas) 700)
    (set! (.-display style) "block")
    (set! (.-marginTop style) "10px")
    (set! (.-border style) "1px solid #CCC")
    canvas))

(defn add-pre [id content]
  (let [p (add-element "pre")
        style (.-style p)]
    (set! (.-id p) id)
    (set! (.-innerHTML p) content)
    (set! (.-maxHeight style) "30vh")
    (set! (.-overflowY style) "auto")
    p))

(defn draw-chart [data]
  ;; TODO: implement some tricky logic that draws column chart for population of 4 most populous areas in the city.
  (let [canvas (.getElementById js/document "canvas")
        ctx (.getContext canvas "2d")
        height (.-height canvas)
        width (.-width canvas)
        n 4
        hcol (int (* 0.75 height))
        wcol (int (/ width (+ 1 n n)))
        areas (take n (sort-by :population > 
                               (filter #(= :area (:type %)) data)))
        hcols (map #(int (* hcol (/ (:population %) (:population (first areas))))) 
                   areas)]
    (.clearRect ctx 0 0 width height)
    (loop [[area & r-areas] areas [hcol & r-hcols] hcols 
           [x & xs] (range wcol (inc width) (* 2 wcol))]
      (when area
        (set! (.-fillStyle ctx) "rgb(0,128,0)")
        (.beginPath ctx)
        (.rect ctx x (- height hcol) wcol height)
        (.fill ctx)
        (set! (.-fillStyle ctx) "rgb(0,0,0)")
        (set! (.-font ctx) "17px Arial")
        (set! (.-textAlign ctx) "center")
        (.fillText ctx (.toLocaleString (:population area)) 
          (int (+ x (/ wcol 2))) (- height hcol 2))
        (set! (.-fillStyle ctx) "rgb(0,0,255)")
        (set! (.-font ctx) "italic 15px Arial")
        (.save ctx)
        (.translate ctx x (- height hcol))
        (.rotate ctx (- (/ js/Math.PI 2)))
        (set! (.-textAlign ctx) "end")
        (.fillText ctx (:unit area) 0 -2)
        (.restore ctx)
        (recur r-areas r-hcols xs)))))
      

(defn ^:export app []
  (fetch-edn "/data"
             (fn [edn]
               (add-pre "pop-edn" (with-out-str (cljs.pprint/pprint edn)))
               (add-button "draw" "Draw Column Chart" (fn [] (draw-chart edn)))
               (add-canvas "canvas"))))