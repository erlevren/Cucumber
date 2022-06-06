Feature: US1003 Kullanici Parametre Kullanarak Arama Yapar
  @parametre
  Scenario: TC06 kullanici parametre ile amazonda arama yapar
    Given kullanici amazon anasayfasinda
    And kullanici "Java" icin arama yapar
    And sonuclarin "Java" icerdigini test eder
    Then sayfayi kapatir