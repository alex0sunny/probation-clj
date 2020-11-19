(ns company.data)

(def data 
  {:unit "Москва"
   :type :city
   :subunits [{:unit "ЮАО"
               :type :area
               :subunits [{:unit "Бирюлёво Восточное", :type :district, :population 155937}
                          {:unit "Бирюлёво Западное", :type :district, :population 88796}
                          {:unit "Братеево", :type :district, :population 110185}
                          {:unit "Даниловский", :type :district, :population 95013}
                          {:unit "Донской", :type :district, :population 52037}
                          {:unit "Зябликово", :type :district, :population 133501}
                          {:unit "Москворечье-Сабурово", :type :district, :population 80934}
                          {:unit "Нагатино-Садовники", :type :district, :population 83607}
                          {:unit "Нагатинский Затон", :type :district, :population 121143}
                          {:unit "Нагорный", :type :district, :population 81794}
                          {:unit "Орехово-Борисово Северное", :type :district, :population 132307}
                          {:unit "Орехово-Борисово Южное", :type :district, :population 147835}
                          {:unit "Царицыно", :type :district, :population 129318}
                          {:unit "Чертаново Северное", :type :district, :population 114653}
                          {:unit "Чертаново Центральное", :type :district, :population 117308}
                          {:unit "Чертаново Южное", :type :district, :population 151899}]}
              {:unit "ЮВАО"
               :type :area
               :subunits [{:unit "Выхино-Жулебино", :type :district, :population 225493}
                          {:unit "Капотня", :type :district, :population 33714}
                          {:unit "Кузьминки", :type :district, :population 146208}
                          {:unit "Лефортово", :type :district, :population 95467}
                          {:unit "Люблино", :type :district, :population 172523}
                          {:unit "Марьино", :type :district, :population 254142}
                          {:unit "Некрасовка", :type :district, :population 83525}
                          {:unit "Нижегородский", :type :district, :population 45738}
                          {:unit "Печатники", :type :district, :population 86706}
                          {:unit "Рязанский", :type :district, :population 110073}
                          {:unit "Текстильщики", :type :district, :population 105398}
                          {:unit "Южнопортовый", :type :district, :population 74841}]}
              {:unit "САО"
               :type :area
               :subunits [{:unit "Аэропорт", :type :district, :population 79541}
                          {:unit "Беговой", :type :district, :population 42908}
                          {:unit "Бескудниковский", :type :district, :population 79732}
                          {:unit "Войковский", :type :district, :population 70899}
                          {:unit "Восточное Дегунино", :type :district, :population 99112}
                          {:unit "Головинский", :type :district, :population 103573}
                          {:unit "Дмитровский", :type :district, :population 93545}
                          {:unit "Западное Дегунино", :type :district, :population 84381}
                          {:unit "Коптево", :type :district, :population 102238}
                          {:unit "Левобережный", :type :district, :population 54712}
                          {:unit "Молжаниновский", :type :district, :population 12264}
                          {:unit "Савёловский", :type :district, :population 59586}
                          {:unit "Сокол", :type :district, :population 60171}
                          {:unit "Тимирязевский", :type :district, :population 83824}
                          {:unit "Ховрино", :type :district, :population 89094}
                          {:unit "Хорошёвский", :type :district, :population 72732}]}
              {:unit "ЗелАО"
               :type :area
               :subunits [{:unit "Крюково", :type :district, :population 103046}
                          {:unit "Матушкино", :type :district, :population 40913}
                          {:unit "Савёлки", :type :district, :population 34726}
                          {:unit "Силино", :type :district, :population 40341}
                          {:unit "Старое Крюково", :type :district, :population 31427}]}
              {:unit "ЮЗАО"
               :type :area
               :subunits [{:unit "Академический", :type :district, :population 110038}
                          {:unit "Гагаринский", :type :district, :population 81967}
                          {:unit "Зюзино", :type :district, :population 127301}
                          {:unit "Коньково", :type :district, :population 156473}
                          {:unit "Котловка", :type :district, :population 65992}
                          {:unit "Ломоносовский", :type :district, :population 88407}
                          {:unit "Обручевский", :type :district, :population 87458}
                          {:unit "Северное Бутово", :type :district, :population 95937}
                          {:unit "Тёплый Стан", :type :district, :population 134562}
                          {:unit "Черёмушки", :type :district, :population 110948}
                          {:unit "Южное Бутово", :type :district, :population 210783}
                          {:unit "Ясенево", :type :district, :population 178264}]}
              {:unit "ТАО"
               :type :area
               :subunits [{:unit "Вороновское, поселение", :type :district, :population 9634}
                          {:unit "Киевский, поселение", :type :district, :population 14215}
                          {:unit "Клёновское, поселение", :type :district, :population 4238}
                          {:unit "Краснопахорское, поселение", :type :district, :population 5380}
                          {:unit "Михайлово-Ярцевское, поселение", :type :district, :population 5768}
                          {:unit "Новофёдоровское, поселение", :type :district, :population 7381}
                          {:unit "Первомайское, поселение", :type :district, :population 9215}
                          {:unit "Роговское, поселение", :type :district, :population 4096}
                          {:unit "Троицк, городской округ", :type :district, :population 61284}
                          {:unit "Щаповское, поселение", :type :district, :population 9601}]}
              {:unit "СЗАО"
               :type :area
               :subunits [{:unit "Куркино", :type :district, :population 34231}
                          {:unit "Митино", :type :district, :population 195476}
                          {:unit "Покровское-Стрешнево", :type :district, :population 59512}
                          {:unit "Северное Тушино", :type :district, :population 166217}
                          {:unit "Строгино", :type :district, :population 161298}
                          {:unit "Хорошёво-Мнёвники", :type :district, :population 174834}
                          {:unit "Щукино", :type :district, :population 111673}
                          {:unit "Южное Тушино", :type :district, :population 109708}]}
              {:unit "СВАО"
               :type :area
               :subunits [{:unit "Алексеевский", :type :district, :population 80634}
                          {:unit "Алтуфьевский", :type :district, :population 57697}
                          {:unit "Бабушкинский", :type :district, :population 88691}
                          {:unit "Бибирево", :type :district, :population 160447}
                          {:unit "Бутырский", :type :district, :population 71798}
                          {:unit "Лианозово", :type :district, :population 86035}
                          {:unit "Лосиноостровский", :type :district, :population 83046}
                          {:unit "Марфино", :type :district, :population 35579}
                          {:unit "Марьина Роща", :type :district, :population 67538}
                          {:unit "Останкинский", :type :district, :population 63697}
                          {:unit "Отрадное", :type :district, :population 185745}
                          {:unit "Ростокино", :type :district, :population 40196}
                          {:unit "Свиблово", :type :district, :population 62981}
                          {:unit "Северное Медведково", :type :district, :population 127986}
                          {:unit "Северный", :type :district, :population 38633}
                          {:unit "Южное Медведково", :type :district, :population 85867}
                          {:unit "Ярославский", :type :district, :population 98272}]}
              {:unit "ВАО"
               :type :area
               :subunits [{:unit "Богородское", :type :district, :population 110137}
                          {:unit "Вешняки", :type :district, :population 122419}
                          {:unit "Восточное Измайлово", :type :district, :population 78206}
                          {:unit "Восточный", :type :district, :population 13752}
                          {:unit "Гольяново", :type :district, :population 163197}
                          {:unit "Ивановское", :type :district, :population 128514}
                          {:unit "Измайлово", :type :district, :population 107883}
                          {:unit "Косино-Ухтомский", :type :district, :population 82413}
                          {:unit "Метрогородок", :type :district, :population 39121}
                          {:unit "Новогиреево", :type :district, :population 98634}
                          {:unit "Новокосино", :type :district, :population 108204}
                          {:unit "Перово", :type :district, :population 141269}
                          {:unit "Преображенское", :type :district, :population 91574}
                          {:unit "Северное Измайлово", :type :district, :population 88007}
                          {:unit "Соколиная Гора", :type :district, :population 92337}
                          {:unit "Сокольники", :type :district, :population 61649}]}
              {:unit "ЦАО"
               :type :area
               :subunits [{:unit "Арбат", :type :district, :population 36308}
                          {:unit "Басманный", :type :district, :population 110897}
                          {:unit "Замоскворечье", :type :district, :population 59305}
                          {:unit "Красносельский", :type :district, :population 48769}
                          {:unit "Мещанский", :type :district, :population 61452}
                          {:unit "Пресненский", :type :district, :population 128314}
                          {:unit "Таганский", :type :district, :population 123532}
                          {:unit "Тверской", :type :district, :population 77947}
                          {:unit "Хамовники", :type :district, :population 109451}
                          {:unit "Якиманка", :type :district, :population 27911}]}
              {:unit "НАО"
               :type :area
               :subunits [{:unit "Внуковское, поселение", :type :district, :population 12816}
                          {:unit "Воскресенское, поселение", :type :district, :population 10037}
                          {:unit "Десёновское, поселение", :type :district, :population 23519}
                          {:unit "Кокошкино, поселение", :type :district, :population 19323}
                          {:unit "Марушкинское, поселение", :type :district, :population 7694}
                          {:unit "Московский, поселение", :type :district, :population 63010}
                          {:unit "Мосрентген, поселение", :type :district, :population 20967}
                          {:unit "Рязановское, поселение", :type :district, :population 21683}
                          {:unit "Сосенское, поселение", :type :district, :population 33096}
                          {:unit "Филимонковское, поселение", :type :district, :population 8017}
                          {:unit "Щербинка, городской округ", :type :district, :population 54008}]}
              {:unit "ЗАО"
               :type :area
               :subunits [{:unit "Внуково", :type :district, :population 25783}
                          {:unit "Дорогомилово", :type :district, :population 76218}
                          {:unit "Крылатское", :type :district, :population 83007}
                          {:unit "Кунцево", :type :district, :population 152467}
                          {:unit "Можайский", :type :district, :population 139081}
                          {:unit "Ново-Переделкино", :type :district, :population 121718}
                          {:unit "Очаково-Матвеевское", :type :district, :population 130975}
                          {:unit "Проспект Вернадского", :type :district, :population 64228}
                          {:unit "Раменки", :type :district, :population 142389}
                          {:unit "Солнцево", :type :district, :population 126901}
                          {:unit "Тропарёво-Никулино", :type :district, :population 124287}
                          {:unit "Филёвский Парк", :type :district, :population 94787}
                          {:unit "Фили-Давыдково", :type :district, :population 115273}]}]})

;; TODO: convert data above to the vector of the form
;; [{:unit "Москва" :type :city :population 12678079 :path ["Москва"]} {:unit "Раменки" :type :district :population 142389 :path ["Москва" "ЗАО" "Раменки"]}...]
;; Please make no assumptions about the depth of the hierarchy
(defn flatten-enrich-data [{:keys [unit subunits] :as data}]
  (if-not subunits [(assoc data :path [unit])]
    (let [unit-lists (map flatten-enrich-data subunits)
          ;; Higher-level unit will always be the first, so we sum populations
          ;; of all higher-level units.
          sum (apply + (map #(:population (first %)) unit-lists))]
      (as-> (assoc (dissoc data :subunits) :population sum) res
            (reduce into [res] unit-lists)
            ;; Since we process each subunit uniformly and as an autonomous unit,
            ;; its path is relative and we need to add parts to the beginning of it.
            ;; So we successively add path parts one by one
            ;; while moving towards top-level unit.
            ;; Top-level unit does not have :path key at this moment, so we update it
            ;; with empty path: (:path % []), and after 'map' it will contain
            ;; a single chain base path: [unit].
            (vec (map #(assoc % :path (into [unit] (:path % []))) res))))))
