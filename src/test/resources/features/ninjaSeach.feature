Feature: Ninja Search

  Scenario: TC01 kullanici ninja search'de telefon aratir

    Given kullanici ninja anasayfasinda
    When kullanici phone sayfasina gider
    Then telefonlarin marka adini alir
    Then tum ogeleri sepete ekle
    Then sepete tikla
    Then sepetteki isimleri al
    Then sepetteki ve sayfadaki listeleri karsilastir
    And sayfayi kapat




