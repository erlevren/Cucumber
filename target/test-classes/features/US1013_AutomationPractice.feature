Feature: US1013 Kullanici register yapabilmeli
  Scenario: TC17 kullanici uygun datalarla register olabilmeli

    Given kullanici "automationUrl" sayfasina gider
    And user sign in linkine tiklar
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin