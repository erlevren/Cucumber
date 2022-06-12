​
#1.    http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
#2.   Cucumber framework’de US1012_Guru_Web_Tables altinda
#Scenario : TC_18_kullanici_sutun_basligi_ile_liste_alabilmeli   olusturun ve
#asagidaki testi yapin
#Given user web sayfasinda
#And “Istenen Baslik”, sutunundaki tum degerleri yazdirir
Feature: US1008 kullanici GuruWebTables a gidebilmeli
  Scenario Outline: TC08 kullanici sutun basligi ile liste alabilmeli
    Given kullanici "guruUrl" sayfasina gider
    And kullanici "<istenenBaslik>" sutunundaki tum degerleri yazdirir
    And sayfayi kapatir

    Examples:
      |istenenBaslik     |
      |Company           |
      |Group             |
      |Prev Close (Rs)   |
      |Current Price (Rs)|
      |% Change          |