
  Feature: US1011 login
    @web
    Scenario Outline: TC16 kullanici ve url testi
      Given kullanici "webdriverUrl" sayfasina gider
      Then kullanici 1 saniye bekler
      Then kullanici login portal'a kadar asagi iner
      And kullanici 1 saniye bekler
      And kullanici login portal'a tiklar
      And kullanici 1 saniye bekler
      And kullanici diger window'a gecer
      And kullanici 1 saniye bekler
      And kullanici username kutusuna "<username>" bilgileri girer
      And kullanici 1 saniye bekler
      And kullanici password kutusuna "<password>" bilgilerini girer
      And kullanici 1 saniye bekler
      And kullanici login butonuna basar
      And kullanici 1 saniye bekler
      And kullanici popup'ta cikan yazinin validation failed oldugunu test eder
      And kullanici 1 saniye bekler
      And kullanici popupu kapatir
      And kullanici 1 saniye bekler
      And kullanici ilk sayfaya geri doner
      And kullanici 1 saniye bekler
      And kullanici ilk sayfaya dondugunu test eder
      And tum sayfalari kapatir

      Examples:
      |username|password|
      |erol    |evren   |