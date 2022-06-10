Feature: US1010 herokuapp Delete testi
  @her @sirali @pr1
  Scenario: TC15 herokuapp'dan delete butonu calismali

    Given kullanici "herokuappUrl" sayfasina gider
    And add element butonuna basar
    And kullanici 2 saniye bekler
    Then Delete butonu gorunur oluncaya kadar bekler
    And Delete butonunun gorunur oldugunu test eder
    And kullanici 2 saniye bekler
    Then Delete butonuna basar
    And Delete butonunun gorunmedigini test eder
    And kullanici 2 saniye bekler
    And sayfayi kapatir