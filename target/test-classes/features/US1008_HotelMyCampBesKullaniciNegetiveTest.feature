Feature: US1008 kullanici farkli yanlis sifre ve kullanici adiyla giris yapamaz
  Scenario Outline: TC13 yanlis kullanici adi ve sifreyle giris yapilamaz

    Given kullanici "HMCUrl" sayfasina gider
    Then Log in yazisina tiklar
    And gecersiz username "<username>" girer
    And gecersiz password "<password>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini kontrol eder
    And sayfayi kapatir

    Examples:
    |username|password|
    |Manager5|Manager5!|
    |Manager6|Manager6!|
    |Manager7|Manager7!|
    |Manager8|Manager8!|
    |Manager9|Manager9!|
