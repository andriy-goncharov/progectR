package tests.page;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class CalculatorTest extends BaseTest {
    @Test
    public void CheckCalc(){
//        basePage.open("https://auto.ria.com/uk/rastamozhka-avto/calculator/");
        calculator.open("https://auto.ria.com/uk/rastamozhka-avto/calculator/");
        calculator
                .selectFuel()
                .selectCountryOfOriginES()
                .selectAgeAuto()
                .enterCostAbroad()
                .enterEngineDislacement()
                .pushBtnResult()
                .checkCustomsClearenceCost();

    }
}
