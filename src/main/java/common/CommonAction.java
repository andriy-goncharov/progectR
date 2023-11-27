package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.CHROME;
import static common.Config.EDGE;
import static constants.Constant.TimeoutWeriable.IMPLICIT_WAIT;

public class CommonAction {
    public static WebDriver createDriver() {
        WebDriver driver = null;
        switch (CHROME){
            case "CHROME":
                System.setProperty("webdriwer.chrome.driver","C:\\webDriver\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--lang=uk-UA");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "EDGE":
                System.setProperty("webdriwer.edge.driver","C:\\webDriver\\msedgedriver.exe");
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--lang=uk-UA");
                driver = new EdgeDriver(edgeOptions);
                break;
            default:
                Assert.fail("Incorrect platform or browser name: "+ CHROME);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
