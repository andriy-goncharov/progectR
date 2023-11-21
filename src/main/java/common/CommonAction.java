package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
                driver = new ChromeDriver();
                break;
            case "EDGE":
                System.setProperty("webdriwer.edge.driver","C:\\webDriver\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser namr: "+ CHROME);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
