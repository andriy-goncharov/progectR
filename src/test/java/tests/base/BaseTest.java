package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.BasePage;
import pages.CalculatorPage;

import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
   protected CalculatorPage calculator = new CalculatorPage(driver);



    @AfterSuite (alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN){
            driver.quit();
        }

    }
}
