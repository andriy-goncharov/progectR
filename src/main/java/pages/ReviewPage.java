package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.Constant.ConstantReviewPage.TYPE_VEHICLE_PASSENGER;

public class ReviewPage extends BasePage{
    public ReviewPage(WebDriver driver) {
        super(driver);
    }

    private final By typeVehicle = By.cssSelector(TYPE_VEHICLE_PASSENGER);
    private final By mark = By.cssSelector("#markaId");
    private final By model = By.cssSelector("#modelId");
    private final By year = By.cssSelector("#year > option:nth-child(7)");
    private final By bodywork = By.cssSelector("#bodyId > option:nth-child(5)");
    private final By motor = By.cssSelector("#fuelIdList > option:nth-child(2)");
    private final By wheelDrive = By.cssSelector("#driveIdList > option:nth-child(2)");
    private final By gearBox = By.cssSelector("gearIdList > option:nth-child(3)");
    private final By race = By.cssSelector("#race");
    private final By fuelConsumption = By.cssSelector("#fuelConsumption");
    private final By firstOwner = By.cssSelector("#first-bayer");
    private final By nameOwner = By.cssSelector("#userName");
    private final By experienceDriving = By.cssSelector("#drivingExperience > option:nth-child(6)");
    private final By owningTime = By.cssSelector("#timeDriving > option:nth-child(6)");
    private final By usingType = By.cssSelector("#usingType > option:nth-child(4)");

    private final By textReview = By.cssSelector("#review");

/// Your Opinion

    private final By korobkaPeredach_minus = By.xpath("//label[@data-gaq='korobka-peredach_minus']");
    private final By korobkaPeredach_plus = By.xpath ("//label[@data-gaq='korobka-peredach_plus']");
    private final By raskhodtopliva_minus = By.xpath("//label[@data-gaq='raskhod-topliva_minus']");
    private final By raskhodtopliva_plus = By.xpath("//label[@data-gaq='raskhod-topliva_plus']");
    private final By dinamika_minus = By.xpath("//label[@data-gaq='dinamika_minus']");
    private final By upravlyaemost_minus = By.xpath("//label[@data-gaq='upravlyaemost_minus']");
    private final By upravlyaemost_plus = By.xpath("//label[@data-gaq='upravlyaemost_plus']");
    private final By tomoza_minus = By.xpath("//label[@data-gaq='tomoza_minus']");
    private final By tomoza_plus = By.xpath("//label[@data-gaq='tomoza_plus']");
    private final By shumoizolyacziya_minus = By.xpath("//label[@data-gaq='shumoizolyacziya_minus']");
    private final By shumoizolyacziya_plus = By.xpath("//label[@data-gaq='shumoizolyacziya_plus']");
    private final By kachestvoSborki_minus = By.xpath("//label[@data-gaq='kachestvo-sborki_minus']");
    private final By kachestvoSborki_plus = By.xpath("//label[@data-gaq='kachestvo-sborki_plus']");
    private final By stoimostObsluzhivaniya_minus = By.xpath("//label[@data-gaq='stoimost-obsluzhivaniya_minus']");
    private final By stoimostObsluzhivaniya_plus = By.xpath("//label[@data-gaq='stoimost-obsluzhivaniya_plus']");
    private final By dorozhnyjProsve_minus = By.xpath("//label[@data-gaq='dorozhnyj-prosve_minus']");
    private final By dorozhnyjProsve_plus = By.xpath("//label[@data-gaq='dorozhnyj-prosve_plus']");
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





    private final By btnSend = By.xpath("//input[@data-gaq='add_reviews_false']");




}


