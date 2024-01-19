package Util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {
    WebDriver driver;
    WebDriverWait wait;
    Actions action;

    public ElementHelper(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.action = new Actions(driver);
    }

    public WebElement presenceElement(By key) {
        return
                wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public WebElement findElement(By key) {
        WebElement element = presenceElement(key);
        return element;
    }

    public void click(By key) {
        findElement(key).click();
        //highlightElement(driver,findElement(key));
    }

    public void sendKey(By key, String text) {
        findElement(key).sendKeys(text);
    }

    public void checkVisible(By key) {
        wait.until(ExpectedConditions.visibilityOf(findElement(key)));


    }

    public void seturControl() {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.setur.com.tr/";

        if (actualUrl.equals(actualUrl)) {
            System.out.println("Setur URL dogrudur.");
        } else {
            System.out.println("Setur URL yanlıştır. Aktual URL: " + actualUrl);
        }
    }

    public void defaultKontrol(By key) {
        click(key);
        Assert.assertTrue(findElement(key).isDisplayed());
    }

        public void araButonuKontrol (By key) {

            Assert.assertTrue(findElement(key).isDisplayed());

        }

        public void antalyaKonrotrol (){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String currentUrl=DriverFactory.getDriver().getCurrentUrl();
            Assert.assertTrue(currentUrl.contains("antalya"));

        }

    
}



