package Pages;

import Util.ElementHelper;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class SeturPage {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;
    static By popUPkapatma = By.cssSelector("[class=\"ins-close-button\"]");

    static By cerezkapatma = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    static By otelSimgesi =By.cssSelector("input[placeholder='Otel Adı Veya Konum']");

    static By liste= By.cssSelector("div[class='sc-94dcce44-2 fEacIV']");
    static By tarihAlani= By.xpath("//div[text()='Giriş - Çıkış Tarihleri']");
    static By aySecilir =By.cssSelector("button[class='sc-8de9de7b-0 kCGMge sc-147d3380-2 cULZMP']");
    static By ilkHafta=By.cssSelector("td[aria-label='Choose Pazartesi, 1 Nisan 2024 as your check-in date. It’s available.']");
    static By sonGün =By.cssSelector("td[aria-label='Choose Pazar, 7 Nisan 2024 as your check-out date. It’s available.']");
    static  By yetiskinSecimi =By.cssSelector("span[class='sc-b2c3f6ee-21 bSPwxV']");
    static By yetiskinArttirma = By.cssSelector("button[data-testid='increment-button']");
    static By yetiskinSayisi = By.cssSelector("span[data-testid='count-label']");
    static By aramaButonu = By.cssSelector("button[class='sc-8de9de7b-0 dYTYAP']");
    static By digerAlan =By.cssSelector("div[class='sc-2569635-6 bHJGNp']");
    static By randomAtama =By.cssSelector ("div[class='sc-6a38e3d8-3 ipgSLB']");
    static By otelSayisi = By.cssSelector("span[class='sc-e4b3cd20-3 ijdvbf']");
    static By sayiKontrol = By.cssSelector("h3[class='sc-2569635-1 byIIER']");




    public SeturPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);


    }

    public void ilkSecenek() {
        //elementHelper.click(liste);

        List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(liste));
        element.get(0).click();


    }

    public void home(){
        driver.get("https://www.setur.com.tr/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void kontrolsaglanir() {
        elementHelper.seturControl();


    }

    public void popUpkapatilir() {
        elementHelper.click(popUPkapatma);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void cerezkapatilir() {
        elementHelper.click(cerezkapatma);
    }

    public void defaultKontroledilir() {
        elementHelper.defaultKontrol(otelSimgesi);
    }

    public void Antalyayazilir() {
        elementHelper.click(otelSimgesi);
        elementHelper.sendKey(otelSimgesi,"Antalya");

    }

    public void tarihTiklanir() {
        elementHelper.click(tarihAlani);
    }

    public void nisanAyisecilir() {
        for(int i=0;i<3;i++) {
            elementHelper.click(aySecilir);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void ilkHaftaSecilir() {
        elementHelper.click(ilkHafta);
        elementHelper.click(sonGün);


    }

    public void yetiskinSayisiSecilir() {
        elementHelper.click(yetiskinSecimi);

    }

    public void yetiskinSayisiArttir() {

        List<WebElement> yetiskinSayisiElement = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(yetiskinSayisi));
        String ilkYetiskinSayisi = yetiskinSayisiElement.get(0).getText();


        List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(yetiskinArttirma));
        element.get(0).click();

        List<WebElement> yetiskinSayisiElement2 = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(yetiskinSayisi));
        String sonYetiskinSayisi = yetiskinSayisiElement.get(0).getText();

        Assert.assertFalse(ilkYetiskinSayisi.equals(sonYetiskinSayisi));
    }

    public void aramaButonu() {
        elementHelper.araButonuKontrol(aramaButonu);
        elementHelper.click(aramaButonu);
    }

    public void antalyaKontrolEdilir() {
        elementHelper.antalyaKonrotrol();
    }

    public void digerAlanagidilir() {
        elementHelper.click(digerAlan);
    }
    String otelSayisiInt;
    public void randomAtamaYapilir() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        List<WebElement> randomElement = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(randomAtama));

        Random random = new Random();
        int randomBookIndex = random.nextInt(4);
        WebElement randomAtama= randomElement.get(randomBookIndex);
        randomAtama.click();

        List<WebElement> otelSayisiElement = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(otelSayisi));
        WebElement otelSayisi = otelSayisiElement.get(randomBookIndex);
        String otelSayisiText=otelSayisi.getText();
        otelSayisiInt=otelSayisiText.substring(1,otelSayisiText.length()-1);
        System.out.println(otelSayisiInt);


    }

    public void otelSayisiKontrol() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String sayi =elementHelper.findElement(sayiKontrol).getText();
        String sayiInt=sayi.substring(sayi.length()-3,sayi.length()-1);
        System.out.println(sayiInt);

        Assert.assertTrue(sayiInt.contains(otelSayisiInt));
    }
}



