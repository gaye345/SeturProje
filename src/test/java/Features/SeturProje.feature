Feature:Setur.com
  Scenario:Setur
    When Setur sayfasina gidilir
    Then Setur URL kontrol edilir
    When Pop-up kapatılır.
    When Cerez kapatılır.
    Then Default kontrol edilir
    When Nereye gideceksiniz alanina Antalya yazilir
    When En üsteki Antalya seçeneğine tıklanılır.
    When Tarih alanina tiklanir
    When Nisan ayi seçilir
    When İlk hafta araligi secilir
    When Yetiskin sayısı secilir
    When Yetiskin sayisi bir arttir ve kontrol et
    When Ara butonu’nun görünürlügü kontrol edilir ve tiklanilir
    Then Açılan url içinde antalya kelimesini içerdiği kontrol edilir.
    When Diger alana gidilir
    When Rastgele secim yapılır
    Then Ekrana cıkan otel sayisinin dogrulugu kontrol edilir


