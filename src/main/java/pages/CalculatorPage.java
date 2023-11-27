package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CalculatorPage extends BasePage {
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }

    private final By fuelPetrol = By.cssSelector("#leftFilterFuel > option:nth-child(1)");
    private final By countryOriginES = By.cssSelector("#leftFilterOrigin > option:nth-child(3)");
    private final By ageAuto = By.cssSelector("#leftFilterAge > option:nth-child(2)");
    private final By price = By.name("price");
    private final By vEngine = By.cssSelector("#leftFilterEngine");
//    private final By btnResult = By.cssSelector("div.form-fields >.calc-btn .button .unlink");
    private final By btnResult = By.cssSelector("#catalogsCustomCalculator > form > div.calc > aside > div.form-fields > button");
    private final By fieldPriceResult = By.cssSelector("#catalogsCustomCalculator > form > div.calc > div > div" +
            ".calc-table.result > ul > li:nth-child(5) > div > span.casual");


    public CalculatorPage selectFuel() {
        driver.findElement(fuelPetrol).click();
        return this;
    }

    public CalculatorPage selectCountryOfOriginES() {
        driver.findElement(countryOriginES).click();
        return this;
    }

    public CalculatorPage selectAgeAuto() {
        driver.findElement(ageAuto).click();
        return this;
    }

    public CalculatorPage enterCostAbroad() {
        driver.findElement(price).sendKeys("3500");
        return this;
    }

    public CalculatorPage enterEngineDislacement() {
        driver.findElement(vEngine).sendKeys("1500");
        return this;
    }

    public CalculatorPage pushBtnResult() {
        driver.findElement(btnResult).click();
        return this;
    }

    public CalculatorPage checkCustomsClearenceCost() {
        // 4649 €
        waitElementIsWisible(fieldPriceResult);
        System.out.println();
        Assert.assertEquals(driver.findElement(fieldPriceResult).getText(), "4649 €");

        return this;
    }
}
