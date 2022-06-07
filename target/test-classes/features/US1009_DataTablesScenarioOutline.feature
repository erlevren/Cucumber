Feature: US1009 Datatables sitesine 5 farkli giris yapalim

  Scenario Outline: TC14 kullanici 5 farkli kayit girisi yapabilmeli
    When kullanici "datatablesUrl" sayfasina gider
    Then new butonuna basar
    And editor firstname kutusuna "<isim>" bilgileri girer
    And kullanici 1 saniye bekler
    And editor lastname kutusuna "<soyisim>" bilgileri girer
    And editor position kutusuna "<position>" bilgileri girer
    And editor office kutusuna "<ofis>" bilgileri girer
    And editor extension kutusuna "<extension>" bilgileri girer
    And editor startdate kutusuna "<startDate>" bilgileri girer
    And editor salary kutusuna "<salary>" bilgileri girer
    And Create tusuna basar
    When kullanici "<isim>" ile arama yapar
    Then isim bolumunde "<isim>" oldugunu test eder
    And sayfayi kapatir

    Examples:
      |isim     | soyisim |position|ofis  |extension|startDate |salary|
      |Erol     |Evren    |TestLead|Paris |ali      |2021-01-21|60000 |
      |Ali      |Veli     |QA      |Kenya |126      |2021-01-20|40000 |
      |Cengiz   |Ezel     |QA      |Adana |130      |2021-03-21|80000 |

