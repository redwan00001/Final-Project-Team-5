package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class WalmartHelpTest extends CommonAPI {

    @Test
    public void TrackOrder1() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.clickOnHelp();
        walmartHelp.clickOnTrackOrder();
        walmartHelp.clickOnYourOrder();
        waitFor(2);

    }

    @Test
    public void Leggings2() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.clickOnDepartment();
        walmartHelp.clickOnAllDepartment();
        walmartHelp.clickOnWomenDepartment();
        walmartHelp.clickOnLeggings();

        waitFor(2);
    }
    @Test
    public void BabyRegistry3() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.clickOnServices();
        walmartHelp.clickOnRegistry();
        walmartHelp.clickOnBabyRegistry();
        waitFor(2);
    }
    @Test
    public void RegistryChecklist4() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.clickOnServices();
        walmartHelp.clickOnRegistry();
        walmartHelp.clickOnBabyRegistry();
        walmartHelp.clickOnRegistryChecklist();
        waitFor(2);
    }
    @Test
    public void CreateRegistry5() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.clickOnServices();
        walmartHelp.clickOnRegistry();
        walmartHelp.clickOnBabyRegistry();
        walmartHelp.clickOnCreateRegistry();
        waitFor(2);
    }
    @Test
    public void StrollerBuyingGuide6() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.clickOnServices();
        walmartHelp.clickOnRegistry();
        walmartHelp.clickOnBabyRegistry();
        walmartHelp.clickOnStrollerBuyingGuide();
        waitFor(2);
    }
    @Test
    public void CarSeatBuyingGuide7() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.clickOnServices();
        walmartHelp.clickOnRegistry();
        walmartHelp.clickOnBabyRegistry();
        walmartHelp.clickOnCarSeatBuyingGuide();
        waitFor(2);
    }
    @Test
    public void CarSeatBuyingGuide8() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.clickOnNurseryChecklist();
        walmartHelp.getCarSeatBuyingGuide();
        waitFor(2);
    }
    @Test
    public void BabyFeedingBasics9() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBabyFeedingBasics();
        waitFor(2);
    }
    @Test
    public void HospitalChecklist10() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getHospitalChecklist();
        waitFor(2);
    }
    @Test
    public void NewParentsChecklist11() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getNewParentsChecklist();
        waitFor(2);
    }
    @Test
    public void Entertainment12() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getEntertainment();
        waitFor(2);
    }
    @Test
    public void ShopByBrand13() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getShopByBrand();
        waitFor(2);
    }
    @Test
    public void BrandHuggle14() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandHuggle();
        waitFor(2);
    }
    @Test
    public void BrandChicco15() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandChicco();
        waitFor(2);
    }
    @Test
    public void BrandOwlet16() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandOwlet();
        waitFor(2);
    }
    @Test
    public void BrandDisneyBaby17() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandDisneyBaby();
        waitFor(2);
    }
    @Test
    public void getBrandOxoTot18() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandOxoTot();
        waitFor(2);
    }
    @Test
    public void BrandNanoBebe19() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandNanoBebe();
        waitFor(2);
    }
    @Test
    public void BrandForMoms20() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandForMoms();
        waitFor(2);
    }
    @Test
    public void BrandFridaBaby21() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandFridaBaby();
        waitFor(2);
    }
    @Test
    public void BrandLittleStarOrganic22() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getRegistry();
        walmartHelp.getBabyRegistry();
        walmartHelp.getBrandLittleStarOrganic();
        waitFor(2);
    }
    @Test
    public void PickToday23() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getPickToday();
        waitFor(2);
    }
    @Test
    public void ChristmasGift24() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getChristmasGift();
        waitFor(2);
    }
    @Test
    public void PhotoBook25() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getPhotoBook();
        waitFor(2);
    }
    @Test
    public void WallArt26() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getWallArt();
        waitFor(2);
    }
    @Test
    public void Posters27() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getPhotoCenter();
        walmartHelp.getPosters();
        waitFor(2);
    }
    @Test
    public void Gifts28() throws InterruptedException {
        pages.WalmartHelp walmartHelp = PageFactory.initElements(driver, pages.WalmartHelp.class);
        walmartHelp.getServices();
        walmartHelp.getPhotoServices();
        walmartHelp.getGifts();
        waitFor(2);
    }


}

