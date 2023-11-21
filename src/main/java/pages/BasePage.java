package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constant.TimeoutWeriable.EXPLICIT_WAIT;


public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url){
        driver.get(url);
    }

    public By waitElementIsWisible(By element){
        new WebDriverWait(this.driver, Duration.ofSeconds(EXPLICIT_WAIT)).until(ExpectedConditions.visibilityOfElementLocated(element));
        return element;
    }
}
