package StepDefinition;

import Pages.SeturPage;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class SeturSteps {

    WebDriver driver = DriverFactory.getDriver();
    SeturPage seturPage = new SeturPage (driver);

    @When("Setur sayfasina gidilir")
    public void sayfayaGit() {
        seturPage.home();
    }

    @Then("Setur URL kontrol edilir")
    public void seturURLKontrolEdilir() {
        seturPage.kontrolsaglanir();
    }

    @When("Pop-up kapatılır.")
    public void popUpKapatilİr() {
        seturPage.popUpkapatilir();
    }


    @When("Cerez kapatılır.")
    public void cerezKapatılır() {
        seturPage.cerezkapatilir();




    }

    @Then("Default kontrol edilir")
    public void defaultKontrolEdilir() {
        seturPage.defaultKontroledilir();

    }

    @When("Nereye gideceksiniz alanina Antalya yazilir")
    public void nereyeGideceksinizAlaninaAntalyaYazilir() {
        seturPage.Antalyayazilir();
    }

    @When("En üsteki Antalya seçeneğine tıklanılır.")
    public void enÜstekiAntalyaSeçeneğineTıklanılır() {
        seturPage.ilkSecenek();
    }

    @When("Tarih alanina tiklanir")
    public void tarihAlaninaTiklanir() {
        seturPage.tarihTiklanir();
    }


    @When("Nisan ayi seçilir")
    public void nisanAyiSeçilir() {
        seturPage.nisanAyisecilir();
    }

    @When("İlk hafta araligi secilir")
    public void ilkHaftaAraligiSecilir() {
        seturPage.ilkHaftaSecilir();
    }


    @When("Yetiskin sayısı secilir")
    public void yetiskinSayısıSecilir() {
        seturPage.yetiskinSayisiSecilir();
    }

    @When("Yetiskin sayisi bir arttir ve kontrol et")
    public void yetiskinSayisiBirArttir() {
        seturPage.yetiskinSayisiArttir();
    }

    @When("Ara butonu’nun görünürlügü kontrol edilir ve tiklanilir")
    public void araButonuNunGörünürlügüKontrolEdilirVeTiklanilir() {
        seturPage.aramaButonu();
    }

    @Then("Açılan url içinde antalya kelimesini içerdiği kontrol edilir.")
    public void açılanUrlIçindeAntalyaKelimesiniIçerdiğiKontrolEdilir() {
        seturPage.antalyaKontrolEdilir();
    }

    @When("Diger alana gidilir")
    public void digerAlanaGidilir() {
        //seturPage.digerAlanagidilir();
    }

    @When("Rastgele secim yapılır")
    public void rastgeleSecimYapılır() {
        seturPage.randomAtamaYapilir();
    }

    @Then("Ekrana cıkan otel sayisinin dogrulugu kontrol edilir")
    public void ekranaCıkanOtelSayisininDogruluguKontrolEdilir() {
        seturPage.otelSayisiKontrol();
    }
}
