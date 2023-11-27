package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.nio.charset.StandardCharsets;

import static constants.Constant.ConstantReviewPage.TYPE_VEHICLE_PASSENGER;
import static org.openqa.selenium.Keys.DOWN;
import static org.openqa.selenium.Keys.ENTER;


public class ReviewPage extends BasePage {
    public ReviewPage(WebDriver driver) {
        super(driver);
    }

    private final By btnCookie = By.cssSelector("#gdprId > div > div > label");
    private final By typeVehicle = By.cssSelector(TYPE_VEHICLE_PASSENGER);
    private final By mark = By.cssSelector("#markaId");
    private final By model = By.cssSelector("#modelId");
    private final By year = By.cssSelector("#year > option:nth-child(7)");
    private final By bodywork = By.cssSelector("#bodyId > option:nth-child(5)");
    private final By motor = By.cssSelector("#fuelIdList > option:nth-child(2)");
    private final By wheelDrive = By.cssSelector("#driveIdList > option:nth-child(2)");
    private final By gearBox = By.cssSelector("#gearIdList > option:nth-child(3)");
    private final By race = By.cssSelector("#race");
    private final By fuelConsumption = By.cssSelector("#fuelConsumption");
    //    private final By firstOwner = By.xpath("//input[@data-gaq='firstOwner']");
    private final By firstOwner = By.cssSelector(".first-bayer");
    private final By nameOwner = By.cssSelector("#userName");
    private final By experienceDriving = By.cssSelector("#drivingExperience > option:nth-child(6)");
    private final By owningTime = By.cssSelector("#timeDriving > option:nth-child(6)");
    private final By usingType = By.cssSelector("#usingType > option:nth-child(4)");

    private final By textReview = By.cssSelector("#review");

////////////// Your Opinion ///////////////////

    private final By korobkaPeredach_minus = By.xpath("//label[@data-gaq='korobka-peredach_minus']");
    private final By korobkaPeredach_plus = By.xpath("//label[@data-gaq='korobka-peredach_plus']");
    private final By raskhodtopliva_minus = By.xpath("//label[@data-gaq='raskhod-topliva_minus']");
    private final By raskhodtopliva_plus = By.xpath("//label[@data-gaq='raskhod-topliva_plus']");
    private final By dinamika_plus = By.xpath("//label[@data-gaq='dinamika_plus']");
    private final By dinamika_minus = By.xpath("//label[@data-gaq='dinamika_minus']");
    private final By upravlyaemost_minus = By.xpath("//label[@data-gaq='upravlyaemost_minus']");
    private final By upravlyaemost_plus = By.xpath("//label[@data-gaq='upravlyaemost_plus']");
    private final By tormoza_minus = By.xpath("//label[@data-gaq='tormoza_minus']");
    private final By tormoza_plus = By.xpath("//label[@data-gaq='tormoza_plus']");
    private final By shumoizolyacziya_minus = By.xpath("//label[@data-gaq='shumoizolyacziya_minus']");
    private final By shumoizolyacziya_plus = By.xpath("//label[@data-gaq='shumoizolyacziya_plus']");
    private final By kachestvoSborki_minus = By.xpath("//label[@data-gaq='kachestvo-sborki_minus']");
    private final By kachestvoSborki_plus = By.xpath("//label[@data-gaq='kachestvo-sborki_plus']");
    private final By stoimostObsluzhivaniya_minus = By.xpath("//label[@data-gaq='stoimost-obsluzhivaniya_minus']");
    private final By stoimostObsluzhivaniya_plus = By.xpath("//label[@data-gaq='stoimost-obsluzhivaniya_plus']");
    private final By dorozhnyjProsvet_minus = By.xpath("//label[@data-gaq='dorozhnyj-prosve_minus']");
    private final By dorozhnyjProsvet_plus = By.xpath("//label[@data-gaq='dorozhnyj-prosve_plus']");
    private final By dizajnKuzova_minus = By.xpath("//label[@data-gaq='dizajn-kuzova_minus']");
    private final By dizajnKuzova_plus = By.xpath("//label[@data-gaq='dizajn-kuzova_plus']");
    private final By obemBagazhnika_minus = By.xpath("//label[@data-gaq='obem-bagazhnika_minus']");
    private final By obemBagazhnika_plus = By.xpath("//label[@data-gaq='obem-bagazhnika_plus']");
    private final By prostorSalona_minus = By.xpath("//label[@data-gaq='prostor-salona_minus']");
    private final By prostorSalona_plus = By.xpath("//label[@data-gaq='prostor-salona_plus']");
    private final By kachestvoMaterialov_minus = By.xpath("//label[@data-gaq='kachestvo-materialov_minus']");
    private final By kachestvoMaterialov_plus = By.xpath("//label[@data-gaq='kachestvo-materialov_plus']");
    private final By czena_minus = By.xpath("//label[@data-gaq='czena_minus']");
    private final By czena_plus = By.xpath("//label[@data-gaq='czena_plus']");


    ///////// Vehicle valuation //////////////


    private final By control_1 = By.cssSelector("#type1-val1+label");
    private final By control_2 = By.cssSelector("#type1-val2+label");
    private final By control_3 = By.cssSelector("#type1-val3+label");
    private final By control_4 = By.cssSelector("#type1-val4+label");
    private final By control_5 = By.cssSelector("#type1-val5+label");

    private final By reliability_1 = By.cssSelector("#type2-val1+label");
    private final By reliability_2 = By.cssSelector("#type2-val2+label");
    private final By reliability_3 = By.cssSelector("#type2-val3+label");
    private final By reliability_4 = By.cssSelector("#type2-val4+label");
    private final By reliability_5 = By.cssSelector("#type2-val5+label");

    private final By comfort_1 = By.cssSelector("#type3-val1+label");
    private final By comfort_2 = By.cssSelector("#type3-val2+label");
    private final By comfort_3 = By.cssSelector("#type3-val3+label");
    private final By comfort_4 = By.cssSelector("#type3-val4+label");
    private final By comfort_5 = By.cssSelector("#type3-val5+label");

    private final By design_1 = By.cssSelector("#type4-val1+label");
    private final By design_2 = By.cssSelector("#type4-val2+label");
    private final By design_3 = By.cssSelector("#type4-val3+label");
    private final By design_4 = By.cssSelector("#type4-val4+label");
    private final By design_5 = By.cssSelector("#type4-val5+label");

    private final By price_1 = By.cssSelector("#type5-val1+label");
    private final By price_2 = By.cssSelector("#type5-val2+label");
    private final By price_3 = By.cssSelector("#type5-val3+label");
    private final By price_4 = By.cssSelector("#type5-val4+label");
    private final By price_5 = By.cssSelector("#type5-val5+label");


    private final By btnSend = By.xpath("//input[@data-gaq='add_reviews']");
    private final By hReview = By.cssSelector("#reviewsForm > div > h2");

    ////////////////// Characteristics /////////////////////
    public ReviewPage сlickCookie() {
        driver.findElement(btnCookie).click();
        return this;
    }


    public ReviewPage selectTypeVehicle() {
        driver.findElement(typeVehicle).click();
        return this;
    }

    public ReviewPage selectMark(String markName) {
        driver.findElement(mark).sendKeys(markName);
        driver.findElement(mark).sendKeys(DOWN);
        driver.findElement(mark).sendKeys(ENTER);

        return this;
    }

    public ReviewPage selectModel(String modelName) {
        driver.findElement(model).sendKeys(modelName);
        driver.findElement(model).sendKeys(DOWN);
        driver.findElement(model).sendKeys(DOWN);
        driver.findElement(model).sendKeys(ENTER);
        return this;
    }

    public ReviewPage selectYear() {
        driver.findElement(year).click();
        return this;
    }

    public ReviewPage selectBodywork() {
        driver.findElement(bodywork).click();
        return this;
    }

    public ReviewPage selectMotor() {
        driver.findElement(motor).click();
        return this;
    }

    public ReviewPage selectWheelDrive() {
        driver.findElement(wheelDrive).click();
        return this;
    }

    public ReviewPage selectGearBox() {
        driver.findElement(gearBox).click();
        return this;
    }

    public ReviewPage inputRace(String raceVal) {
        driver.findElement(race).sendKeys(raceVal);
        return this;
    }

    public ReviewPage inputFuelConsumption(String fuelC) {
        driver.findElement(fuelConsumption).sendKeys(fuelC);
        return this;
    }

    ///////////////////// Your Review //////////////////////////////
    public ReviewPage selectfirstOwner() {
        driver.findElement(firstOwner).click();
        return this;
    }

    public ReviewPage inputNameOwner(String actualNameOwn) {
        driver.findElement(nameOwner).sendKeys(actualNameOwn);
        return this;
    }

    public ReviewPage seelctExperienceDriving() {
        driver.findElement(experienceDriving).click();
        return this;
    }

    public ReviewPage selectOwningTime() {
        driver.findElement(owningTime).click();
        return this;
    }

    public ReviewPage selectUsingType() {
        driver.findElement(usingType).click();
        return this;
    }

    public ReviewPage inputReview(String yourReview) {
        driver.findElement(textReview).sendKeys(new String(yourReview.getBytes(), StandardCharsets.UTF_8));
        return this;
    }

    /////////////////// Your Opinion ////////////////

    public ReviewPage selectKorobkaPeredach(Boolean korobkaPeredach) {
        if (korobkaPeredach) {
            driver.findElement(korobkaPeredach_plus).click();
        } else {
            driver.findElement(korobkaPeredach_minus).click();
        }
        return this;
    }

    public ReviewPage selectRaskhodtopliva(Boolean raskhodtopliva) {
        if (raskhodtopliva) {
            driver.findElement(raskhodtopliva_plus).click();
        } else {
            driver.findElement(raskhodtopliva_minus).click();
        }
        return this;
    }

    public ReviewPage selectDinamika(Boolean dinamika) {
        if (dinamika) {
            driver.findElement(dinamika_plus).click();
        } else {
            driver.findElement(dinamika_minus).click();
        }
        return this;
    }

    public ReviewPage selectUpravlyaemost(Boolean upravlyaemost) {
        if (upravlyaemost) {
            driver.findElement(upravlyaemost_plus).click();
        } else {
            driver.findElement(upravlyaemost_minus).click();
        }
        return this;
    }

    public ReviewPage selectTormoza(Boolean tormoza) {
        if (tormoza) {
            driver.findElement(tormoza_plus).click();
        } else {
            driver.findElement(tormoza_minus).click();
        }
        return this;
    }

    public ReviewPage selectShumoizolyacziya(Boolean shumoizolyacziya) {
        if (shumoizolyacziya) {
            driver.findElement(shumoizolyacziya_plus).click();
        } else {
            driver.findElement(shumoizolyacziya_minus).click();
        }
        return this;
    }

    public ReviewPage selectKachestvoSborki(Boolean kachestvoSborki) {
        if (kachestvoSborki) {
            driver.findElement(kachestvoSborki_plus).click();
        } else {
            driver.findElement(kachestvoSborki_minus).click();
        }
        return this;
    }

    public ReviewPage selectStoimostObsluzhivaniya(Boolean stoimostObsluzhivaniya) {
        if (stoimostObsluzhivaniya) {
            driver.findElement(stoimostObsluzhivaniya_plus).click();
        } else {
            driver.findElement(stoimostObsluzhivaniya_minus).click();
        }
        return this;
    }

    public ReviewPage selectDorozhnyjProsvet(Boolean dorozhnyjProsvet) {
        if (dorozhnyjProsvet) {
            driver.findElement(dorozhnyjProsvet_plus).click();
        } else {
            driver.findElement(dorozhnyjProsvet_minus).click();
        }
        return this;
    }

    public ReviewPage selectDizajnKuzova(Boolean dizajnKuzova) {
        if (dizajnKuzova) {
            driver.findElement(dizajnKuzova_plus).click();
        } else {
            driver.findElement(dizajnKuzova_minus).click();
        }
        return this;
    }

    public ReviewPage selectstObemBagazhnika(Boolean obemBagazhnika) {
        if (obemBagazhnika) {
            driver.findElement(obemBagazhnika_plus).click();
        } else {
            driver.findElement(obemBagazhnika_minus).click();
        }
        return this;
    }

    public ReviewPage selectProstorSalona(Boolean prostorSalona) {
        if (prostorSalona) {
            driver.findElement(prostorSalona_plus).click();
        } else {
            driver.findElement(prostorSalona_minus).click();
        }
        return this;
    }

    public ReviewPage selectKachestvoMaterialov(Boolean kachestvoMaterialov) {
        if (kachestvoMaterialov) {
            driver.findElement(kachestvoMaterialov_plus).click();
        } else {
            driver.findElement(kachestvoMaterialov_minus).click();
        }
        return this;
    }

    public ReviewPage selectCzena(Boolean czena) {
        if (czena) {
            driver.findElement(czena_plus).click();
        } else {
            driver.findElement(czena_minus).click();
        }
        return this;
    }

    ///////////// Your valuation ///////////////

    public ReviewPage selectControlLevel(int level) {
        switch (level) {
            case 1:
                driver.findElement(control_1).click();
                return this;
            case 2:
                driver.findElement(control_2).click();
                return this;
            case 3:
                driver.findElement(control_3).click();
                return this;
            case 4:
                driver.findElement(control_4).click();
                return this;
            default:
                driver.findElement(control_5).click();
                return this;
        }
    }

    public ReviewPage selectReliabilityLevel(int level) {
        switch (level) {
            case 1:
                driver.findElement(reliability_1).click();
                return this;
            case 2:
                driver.findElement(reliability_2).click();
                return this;
            case 3:
                driver.findElement(reliability_3).click();
                return this;
            case 4:
                driver.findElement(reliability_4).click();
                return this;
            default:
                driver.findElement(reliability_5).click();
                return this;
        }
    }

    public ReviewPage selectComfortLevel(int level) {
        switch (level) {
            case 1:
                driver.findElement(comfort_1).click();
                return this;
            case 2:
                driver.findElement(comfort_2).click();
                return this;
            case 3:
                driver.findElement(comfort_3).click();
                return this;
            case 4:
                driver.findElement(comfort_4).click();
                return this;
            default:
                driver.findElement(comfort_5).click();
                return this;
        }
    }

    public ReviewPage selectDesignLevel(int level) {
        switch (level) {
            case 1:
                driver.findElement(design_1).click();
                return this;
            case 2:
                driver.findElement(design_2).click();
                return this;
            case 3:
                driver.findElement(design_3).click();
                return this;
            case 4:
                driver.findElement(design_4).click();
                return this;
            default:
                driver.findElement(design_5).click();
                return this;
        }
    }

    public ReviewPage selectPriceLevel(int level) {
        switch (level) {
            case 1:
                driver.findElement(price_1).click();
                return this;
            case 2:
                driver.findElement(price_2).click();
                return this;
            case 3:
                driver.findElement(price_3).click();
                return this;
            case 4:
                driver.findElement(price_4).click();
                return this;
            default:
                driver.findElement(price_5).click();
                return this;
        }
    }

    public ReviewPage sendReview() {
        driver.findElement(btnSend).click();
        return this;
    }

    public ReviewPage checkReviewExist() {
        // 4649 €
        waitElementIsWisible(hReview);
        System.out.println(hReview);
        Assert.assertTrue(driver.findElement(hReview).getText().contains("Suzuki Vitara 2018"));
        return this;
    }
}



