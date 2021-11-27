package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.WalmartHelp;

public class WalmartHelpTest extends CommonAPI {

    @Test
    public void TrackOrder1() throws InterruptedException {
        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);

        walmartHelp.clickOnHelp();
        walmartHelp.clickOnCancelPopUp();
        waitFor(20);
        walmartHelp.clickOnTrackOrder();
        waitFor(1);
        walmartHelp.clickOnYourOrder();
        waitFor(1);

    }

//    @Test
//    public void Leggings2() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.hoverOverDepartment();
//        walmartHelp.clickOnAllDepartment();
//        walmartHelp.clickOnWomenDepartment();
//        walmartHelp.clickOnLeggings();
//
//        waitFor(2);
//    }
//    @Test
//    public void BabyRegistry3() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.hoverOverServices();
//        walmartHelp.clickOnRegistry();
//        walmartHelp.clickOnBabyRegistry();
//        waitFor(2);
//    }
//    @Test
//    public void RegistryChecklist4() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.hoverOverServices();
//        walmartHelp.clickOnRegistry();
//        walmartHelp.clickOnBabyRegistry();
//        walmartHelp.clickOnRegistryChecklist();
//        waitFor(2);
//    }
//    @Test
//    public void CreateRegistry5() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.hoverOverServices();
//        walmartHelp.clickOnRegistry();
//        walmartHelp.clickOnBabyRegistry();
//        walmartHelp.clickOnCreateRegistry();
//        waitFor(2);
//    }
//    @Test
//    public void StrollerBuyingGuide6() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.hoverOverServices();
//        walmartHelp.clickOnRegistry();
//        walmartHelp.clickOnBabyRegistry();
//        walmartHelp.clickOnStrollerBuyingGuide();
//        waitFor(2);
//    }
//    @Test
//    public void CarSeatBuyingGuide7() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.hoverOverServices();
//        walmartHelp.clickOnRegistry();
//        walmartHelp.clickOnBabyRegistry();
//        walmartHelp.clickOnCarSeatBuyingGuide();
//        waitFor(2);
//    }
//    @Test
//    public void CarSeatBuyingGuide8() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.clickOnNurseryChecklist();
//        walmartHelp.getCarSeatBuyingGuide();
//        waitFor(2);
//    }
//    @Test
//    public void BabyFeedingBasics9() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBabyFeedingBasics();
//        waitFor(2);
//    }
//    @Test
//    public void HospitalChecklist10() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getHospitalChecklist();
//        waitFor(2);
//    }
//    @Test
//    public void NewParentsChecklist11() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getNewParentsChecklist();
//        waitFor(2);
//    }
//    @Test
//    public void Entertainment12() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getEntertainment();
//        waitFor(2);
//    }
//    @Test
//    public void ShopByBrand13() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getShopByBrand();
//
//    }
//    @Test
//    public void BrandHuggle14() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandHuggle();
//
//    }
//    @Test
//    public void BrandChicco15() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandChicco();
//
//    }
//    @Test
//    public void BrandOwlet16() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandOwlet();
//
//    }
//    @Test
//    public void BrandDisneyBaby17() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandDisneyBaby();
//
//    }
//    @Test
//    public void getBrandOxoTot18() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandOxoTot();
//
//    }
//    @Test
//    public void BrandNanoBebe19() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandNanoBebe();
//
//    }
//    @Test
//    public void BrandForMoms20() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandForMoms();
//
//    }
//    @Test
//    public void BrandFridaBaby21() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandFridaBaby();
//
//    }
//    @Test
//    public void BrandLittleStarOrganic22() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getRegistry();
//        walmartHelp.getBabyRegistry();
//        walmartHelp.getBrandLittleStarOrganic();
//
//    }
//    @Test
//    public void PickToday23() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getPhotoServices();
//        walmartHelp.getPhotoCenter();
//        walmartHelp.getPickToday();
//
//    }
//    @Test
//    public void ChristmasGift24() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getPhotoServices();
//        walmartHelp.getPhotoCenter();
//        walmartHelp.getChristmasGift();
//
//    }
//    @Test
//    public void PhotoBook25() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getPhotoServices();
//        walmartHelp.getPhotoCenter();
//        walmartHelp.getPhotoBook();
//
//    }
//    @Test
//    public void WallArt26() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getPhotoServices();
//        walmartHelp.getPhotoCenter();
//        walmartHelp.getWallArt();
//
//    }
//    @Test
//    public void Posters27() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getPhotoServices();
//        walmartHelp.getPhotoCenter();
//        walmartHelp.getPosters();
//
//    }
//    @Test
//    public void Gifts28() throws InterruptedException {
//        WalmartHelp walmartHelp = PageFactory.initElements(driver, WalmartHelp.class);
//        walmartHelp.getServices();
//        walmartHelp.getPhotoServices();
//        walmartHelp.getGifts();
//
//    }


}

