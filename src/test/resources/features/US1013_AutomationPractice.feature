Feature: US1013 Kullanici register yapabilmeli
  @auto
  Scenario: TC17 kullanici uygun datalarla register olabilmeli

    Given kullanici "automationUrl" sayfasina gider
    And kullanici 1 saniye bekler
    And user sign in linkine tiklar
    And kullanici 1 saniye bekler
    And user Create and account bolumune email adresi girer
    And kullanici 1 saniye bekler
    And Create an Account butonuna basar
    And kullanici 5 saniye bekler
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And kullanici 2 saniye bekler
    And user Register butonuna basar
    And kullanici 5 saniye bekler
    Then hesap olustugunu dogrulayin