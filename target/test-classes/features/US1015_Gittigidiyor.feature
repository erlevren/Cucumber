Feature: US1015 Gittigidiyor sitesinde arama yapilir
  Scenario: TC19 arama yapilan urunleri txt dosyasina yazdirma
    Given kullanici "gittigidiyorUrl" sayfasina gider
    And kullanici 5 saniye bekler
    Then kullanici bilgisayar icin arama yapar
    And kullanici 5 saniye bekler
    Then kullanici arama sayfasinda ikinci sayfaya gecer
    And kullanici 5 saniye bekler
    And kullanici ikinci sayfada oldugunu test eder
    And kullanici 5 saniye bekler
    And kullanici urunlerden rastgele birini secer, bilgilerini ve tutarini txt dosyaya yazdirir
    And kullanici 5 saniye bekler
    And kullanici urunu sepete ekler
    And kullanici 5 saniye bekler
    And kullanici sayfadaki ve sepetteki urunun fiyatinin dogrulugunu test eder
    And kullanici 5 saniye bekler
    And kullanici urunu arttirir ve 2 adet oldugunu dogrular
    And kullanici 5 saniye bekler
    And kullanici urunu sepetten siler ve sepetin bos oldugunu dogrular
