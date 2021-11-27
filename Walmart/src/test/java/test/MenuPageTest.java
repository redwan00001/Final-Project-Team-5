package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.MenuPage;

public class MenuPageTest extends CommonAPI {
    @Test
    public void Oil1() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getAutocare();
        menuPage.getAutocareServiceCenter();
        menuPage.getOil();
        waitFor(1);
    }
    @Test
    public void ShopNewCar2() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getAutocare();
        menuPage.getAutoBuying();
        menuPage.getShopNewCar();
        waitFor(2);
    }
    @Test
    public void ShopUsedCars3() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getAutocare();
        menuPage.getAutoBuying();
        menuPage.getShopUsedCars();
        waitFor(2);
    }
    @Test
    public void SellYourCar4() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getAutocare();
        menuPage.getAutoBuying();
        menuPage.getSellYourCar();
        waitFor(2);
    }
    @Test
    public void AutoCareServiceCenter5() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getAutocare();
        menuPage.getAutocareServiceCenter();
        waitFor(2);
    }
    @Test
    public void WellnessHub6() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        waitFor(1);
    }
    @Test
    public void FluShot7() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getFluShot();
        waitFor(2);
    }
    @Test
    public void HighFiberFood8() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getHighFiberFood();
        waitFor(2);
    }
    @Test
    public void FaceMask9() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getFaceMask();
        waitFor(2);
    }
    @Test
    public void HealthBrands10() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getHealthBrands();
        waitFor(2);
    }
    @Test
    public void EatBetter11() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getEatBetter();
        waitFor(2);
    }
    @Test
    public void ManageWeight12() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getManageWeight();
        waitFor(2);
    }
    @Test
    public void VisionCenter13() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getVisionCenter();
        waitFor(2);
    }
    @Test
    public void ProteinPowders14() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getProteinPowders();
        waitFor(2);
    }
    @Test
    public void ProteinShakes15() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getProteinShakes();
        waitFor(2);
    }
    @Test
    public void ProteinBars16() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getProteinBars();
        waitFor(2);
    }
    @Test
    public void Multivitamins17() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getMultivitamins();
        waitFor(2);
    }
    @Test
    public void DietSnacks18() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getDietSnacks();
        waitFor(2);
    }
    @Test
    public void BeautySupplements19() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getBeautySupplements();
        waitFor(2);
    }
    @Test
    public void SleepSupplements20() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getSleepSupplements();
        waitFor(2);
    }
    @Test
    public void PainRelievers21() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getPainRelievers();
        waitFor(2);
    }
    @Test
    public void QuitSmoking22() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getQuitSmoking();
        waitFor(2);
    }
    @Test
    public void AllergyMedicine23() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getAllergyMedicine();
        waitFor(2);
    }
    @Test
    public void HeatingPads24() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getHeatingPads();
        waitFor(2);
    }
    @Test
    public void FootSpas25() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getFootSpas();
        waitFor(2);
    }
    @Test
    public void EssentialOils26() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getEssentialOils();
        waitFor(2);
    }
    @Test
    public void MindfulBeauty27() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getMindfulBeauty();
        waitFor(2);
    }
    @Test
    public void SkinCareTools28() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getSkinCareTools();
        waitFor(2);
    }
    @Test
    public void NoSugarFood29() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getNoSugarFood();
        waitFor(2);
    }
    @Test
    public void LowCalorieFood30() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getLowCalorieFood();
        waitFor(2);
    }
    @Test
    public void LowSodiumFoods31() throws InterruptedException {
        MenuPage menuPage = PageFactory.initElements(driver, MenuPage.class);
        menuPage.hoverOverServices();
        menuPage.getHealthService();
        menuPage.getWellnessHub();
        menuPage.getLowSodiumFoods();
        waitFor(2);
    }
}
