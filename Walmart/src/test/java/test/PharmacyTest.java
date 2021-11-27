package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import pages.PharmacyPage;
import org.testng.annotations.Test;

public class PharmacyTest extends CommonAPI {
    @Test
    public void verifyFluShot1() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnFluShot();
        homePage.clickOnScheduleNowFluShot();
    }

    @Test
    public void verifyDigitalVaccineRecord2() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnDigitalVaccineRecord();
        homePage.clickOnDigitalVaccineRecordViewNow();
    }

    @Test
    public void verifyDiabetesCareShopNow3() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnDiabetesCare();
        homePage.clickOnDiabetesCareShopNow();
    }

    @Test
    public void verifyReliOnPrimeBloodGlucoseTestStrips4() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnDiabetesCare();
        homePage.clickOnDiabetesCareShopNow();
        homePage.clickOnReliOnPrimeBloodGlucoseTestStrips();
    }

    @Test
    public void verifyReliOnPremierBloodGlucoseTestStrips5() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnDiabetesCare();
        homePage.clickOnDiabetesCareShopNow();
        homePage.clickOnReliOnPremierBloodGlucoseTestStrips();

    }

    @Test
    public void verifyDiabetesCareMonitors6() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnDiabetesCare();
        homePage.clickOnDiabetesCareMonitors();
    }

    @Test
    public void verifyWalmartHealthVisit7() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnWalmartHealth();
        homePage.clickOnScheduleWalmartHealthVisit();

    }
    @Test
    public void verifyWalmartHealthVisitZipCode8() throws InterruptedException {
        PharmacyPage homePage = PageFactory.initElements(driver, PharmacyPage.class);
        homePage.clickOnViewAll();
        homePage.clickOnPharmacy();
        homePage.clickOnWalmartHealth();
        homePage.clickOnScheduleWalmartHealthVisit();
        homePage.clickOnWalmartHealthZipCode();

    }



}
