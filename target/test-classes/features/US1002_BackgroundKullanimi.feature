@wip
Feature: US1002 Kullanici Ortak Adimlari Background ile calistirir
  Background: ortak adim
    Given kullanici amazon anasayfasinda

    Scenario: T04 amazon nutella aramasi
      And kullanici Nutella icin arama yapar
      Then sonuclarin Nutella icerdigini test eder
      And sayfayi kapatir
    @pr2
    Scenario: T05 amazon java aramasi
      And kullanici Java icin arama yapar
      Then sonuclarin Java icerdigini test eder
      And sayfayi kapatir