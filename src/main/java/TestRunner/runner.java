package TestRunner;
import Util.DriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"StepDefinition","Util"},
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }
)
class runner extends AbstractTestNGCucumberTests {
    static WebDriver driver = DriverFactory.getDriver();
}