package tests.page;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import java.nio.charset.Charset;

import static tests.Constants.Constants.ReviewText.TEXT_REVIEW_VITARA;

public class ReviewTest extends BaseTest {
    @Test
    public void inputReview(){
        review.open("https://auto.ria.com/uk/reviews/add.html");
        review
                .сlickCookie()
                .selectTypeVehicle()
                .selectMark("Suzuki")
                .selectModel("Vitara")
                .selectYear()
//                .selectBodywork()
                .selectMotor()
                .selectWheelDrive()
                .selectGearBox()
                .inputRace("45")
                .inputFuelConsumption("7.5");

        review
                .selectfirstOwner()
                .inputNameOwner("TEST")
                .seelctExperienceDriving()
                .selectOwningTime()
                .selectUsingType()
                .inputReview(TEXT_REVIEW_VITARA);
        review
                .selectKorobkaPeredach(true)
                .selectRaskhodtopliva(true)
                .selectDinamika(true)
                .selectUpravlyaemost(true)
                .selectTormoza(true)
                .selectShumoizolyacziya(false)
                .selectKachestvoSborki(true)
                .selectStoimostObsluzhivaniya(true)
                .selectDorozhnyjProsvet(true)
                .selectDizajnKuzova(true)
                .selectstObemBagazhnika(true)
                .selectProstorSalona(true)
                .selectKachestvoMaterialov(true)
                .selectCzena(true);

        review
                .selectControlLevel(5)
                .selectReliabilityLevel(5)
                .selectComfortLevel(5)
                .selectDesignLevel(5)
                .selectPriceLevel(5)
                .sendReview();
    }
}
