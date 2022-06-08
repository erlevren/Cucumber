# http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
# Cucumber framework’de US1012_Guru_Web_Tables altinda
Feature: US_008 web tablosundaki istenen sutunu yazdırma
  @guru
  Scenario: TC001 kullanıcı sutun baslıgı ile liste alabilmeli

    Given kullanici "guruUrl" sayfasina gider
    And kullanıcı "Company" sutunundaki tum degerleri yazdirir
    And kullanici 3 saniye bekler
    Then sayfayi kapatir