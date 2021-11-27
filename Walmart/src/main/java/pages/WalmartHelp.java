package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WalmartHelp extends CommonAPI {

    @FindBy(xpath = "/html/body/div[3]/div/div[3]/div[1]/div/div[1]/button/i")
    WebElement cancelPopUp;

    @FindBy(xpath = "//a[normalize-space()='Help']")
    WebElement help;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/section/div[2]/section/ul/li[1]/a/div/div/p")
    WebElement trackOrder;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/section/div[3]/div[2]/section/div/article/div/p[2]/a")
    WebElement yourOrder;

    @FindBy(xpath = "//a[@class='no-underline pointer f6 white mr4'][normalize-space()='All Departments']")
    WebElement allDepartment;

    @FindBy(xpath = "//button[normalize-space()='Departments']")
    WebElement department;

    @FindBy(xpath = "//a[normalize-space()='Women']")
    WebElement womenDepartment;

    @FindBy(xpath = "//button[normalize-space()='T-Shirts']")
    WebElement getTShirts;

    @FindBy(xpath = "//button[normalize-space()='Pants & Leggings']")
    WebElement leggings;

    @FindBy(xpath = "//button[@id='header-services-button']//div[@class='b_a']//*[name()='svg']")
    WebElement services;

    @FindBy(xpath = "//button[@class='g_a r_a aw_c active-department']")
    WebElement registry;

    @FindBy(xpath = "//div[contains(text(),'Baby Registry')]")
    WebElement babyRegistry;

    @FindBy(xpath = "//span[normalize-space()='Baby Registry Checklist']")
    WebElement registryChecklist;

    @FindBy(xpath = "//span[normalize-space()='How to Create Your Baby Registry']")
    WebElement createRegistry;

    @FindBy(xpath = "//span[normalize-space()='Stroller Buying Guide']")
    WebElement strollerBuyingGuide;

    @FindBy(xpath = "//span[normalize-space()='Car Seat Buying Guide']")
    WebElement carSeatBuyingGuide;

    @FindBy(xpath = "//span[normalize-space()='Baby Nursery Checklist']")
    WebElement nurseryChecklist;

    @FindBy(xpath = "//span[normalize-space()='Baby Feeding Basics']")
    WebElement babyFeedingbasics;

    @FindBy(xpath = "//span[normalize-space()='Hospital Checklist']")
    WebElement hospitalChecklist;

    @FindBy(xpath = "//span[normalize-space()=\"New Parent's Checklist\"]")
    WebElement newParentsChecklist;

    @FindBy(xpath = "//span[normalize-space()='How to Entertain Your Baby at Home']")
    WebElement entertainment;

    @FindBy(xpath = "//span[contains(text(),'Shop by Brand')]")
    WebElement shopByBrand;

    @FindBy(xpath = "//span[@class='SideBarMenu-title'][normalize-space()='Huggies']")
    WebElement brandHuggle;

    @FindBy(xpath = "//span[@class='SideBarMenu-title'][normalize-space()='Chicco']")
    WebElement brandChicco;

    @FindBy(xpath = "//span[@class='SideBarMenu-title'][normalize-space()='Owlet']")
    WebElement brandOwlet;

    @FindBy(xpath = "//span[@class='SideBarMenu-title'][normalize-space()='Disney Baby']")
    WebElement brandDisneyBaby;

    @FindBy(xpath = "//span[@class='SideBarMenu-title'][normalize-space()='OXO Tot']")
    WebElement brandOxoTot;

    @FindBy(xpath = "//span[@class='SideBarMenu-title'][normalize-space()='Nanobebe']")
    WebElement brandNanoBebe;

    @FindBy(xpath = "//span[normalize-space()='4moms']")
    WebElement brandForMoms;

    @FindBy(xpath = "//span[normalize-space()='FridaBaby']")
    WebElement brandFridaBaby;

    @FindBy(xpath = "//span[normalize-space()='Little Star Organic']")
    WebElement brandLittleStarOrganic;

    @FindBy(xpath = "//button[@class='g_a r_a aw_c active-department']")
    WebElement photoServices;

    @FindBy(xpath = "//div[normalize-space()='Photo Center']")
    WebElement photoCenter;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='Pickup Today']")
    WebElement pickToday;

    @FindBy(xpath = "//a[@class='nav-link'][normalize-space()='Christmas Gifts']")
    WebElement christmasGift;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='Photo Books']")
    WebElement photoBook;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='Wall Art']")
    WebElement wallArt;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='Posters']")
    WebElement posters;

    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle'][normalize-space()='Gifts']")
    WebElement gifts;



    public WebElement getCancelPopUp() { return cancelPopUp; }
    public WebElement getHelp() {
        return help;
    }

    public WebElement getTrackOrder() {
        return trackOrder;
    }
    public WebElement getYourOrder(){
        return yourOrder;
    }
    public WebElement getAllDepartment() {
        return allDepartment;
    }
    public WebElement getDepartment() { return department; }
    public WebElement getWomenDepartment() {
        return womenDepartment;
    }
    public WebElement getGetTShirts() {
        return getTShirts;
    }
    public WebElement getLeggings() {
        return leggings;
    }
    public WebElement getServices() {
        return services;
    }
    public WebElement getRegistry() {
        return registry;
    }
    public WebElement getBabyRegistry() {
        return babyRegistry;
    }
    public WebElement getRegistryChecklist() {
        return registryChecklist;
    }
    public WebElement getCreateRegistry() {
        return createRegistry;
    }
    public WebElement getStrollerBuyingGuide() { return
            strollerBuyingGuide;
    }
    public WebElement getCarSeatBuyingGuide() { return
            carSeatBuyingGuide;
    }
    public WebElement getNurseryChecklist() {
        return nurseryChecklist;
    }
    public WebElement getBabyFeedingBasics() {
        return babyFeedingbasics;
    }
    public WebElement getHospitalChecklist() {
        return hospitalChecklist;
    }
    public WebElement getNewParentsChecklist() {
        return newParentsChecklist;
    }
    public WebElement getEntertainment() {
        return entertainment;
    }
    public WebElement getShopByBrand() {
        return shopByBrand;
    }
    public WebElement getBrandHuggle() {
        return brandHuggle;
    }
    public WebElement getBrandChicco() {
        return brandChicco;
    }
    public WebElement getBrandOwlet() {
        return brandOwlet;
    }
    public WebElement getBrandDisneyBaby() {
        return brandDisneyBaby;
    }
    public WebElement getBrandOxoTot() {
        return brandOxoTot;
    }
    public WebElement getBrandNanoBebe() {
        return brandNanoBebe;
    }
    public WebElement getBrandForMoms() {
        return brandForMoms;
    }
    public WebElement getBrandFridaBaby() {
        return brandFridaBaby;
    }
    public WebElement getBrandLittleStarOrganic() {
        return brandLittleStarOrganic;
    }
    public WebElement getPhotoServices() {
        return photoServices;
    }
    public WebElement getPhotoCenter() {
        return photoCenter;
    }
    public WebElement getPickToday() {
        return pickToday;
    }
    public WebElement getChristmasGift() {
        return christmasGift;
    }
    public WebElement getPhotoBook() {
        return photoBook;
    }
    public WebElement getWallArt() {
        return wallArt;
    }
    public WebElement getPosters() {
        return posters;
    }
    public WebElement getGifts() {
        return gifts;
    }



    public void clickOnCancelPopUp(){
        clickOn(getCancelPopUp());
    }
    public void clickOnHelp() {
        clickOn(getHelp());
    }
    public void clickOnTrackOrder() {
        clickOn(getTrackOrder());
    }
    public void clickOnYourOrder(){
        clickOn(getYourOrder());
    }
    public void clickOnAllDepartment() {
        clickOn(getAllDepartment());
    }
    public void hoverOverDepartment(){

    }
    public void clickOnWomenDepartment() {
        clickOn(getWomenDepartment());
    }
    public void getTShirts() {
        clickOn(getGetTShirts());
    }
    public void clickOnLeggings() {
        clickOn(getLeggings());
    }
    public void hoverOverServices() {
    }
    public void clickOnRegistry() {
        clickOn(getRegistry());
    }
    public void clickOnBabyRegistry() {
        clickOn(getBabyRegistry());
    }
    public void clickOnRegistryChecklist() {
        clickOn(getRegistryChecklist());
    }
    public void clickOnCreateRegistry() {
    }
    public void clickOnStrollerBuyingGuide() {
    }
    public void clickOnCarSeatBuyingGuide() {
    }
    public void clickOnNurseryChecklist() {
    }
    public void clickOnBabyFeedingBasics() {
    }
    public void HospitalChecklist() { clickOn(getHospitalChecklist());
    }
    public void NewParentsChecklist() { clickOn(getNewParentsChecklist());
    }
    public void Entertainment() { clickOn(getEntertainment());
    }
    public void ShopByBrand() { clickOn(getShopByBrand());
    }
    public void BrandHuggle() { clickOn(getBrandHuggle());
    }
    public void BrandChicco() { clickOn(getBrandChicco());
    }
    public void BrandOwlet() { clickOn(getBrandOwlet());
    }
    public void BrandDisneyBaby() {clickOn(getBrandDisneyBaby());
    }
    public void BrandOxoTot() { clickOn(getBrandOxoTot());
    }
    public void BrandNanoBebe() { clickOn(getBrandNanoBebe());
    }
    public void BrandForMoms() { clickOn(getBrandForMoms());
    }
    public void BrandFridaBaby() { clickOn(getBrandFridaBaby());
    }
    public void BrandLittleStarOrganic() { clickOn(getBrandLittleStarOrganic());
    }
    public void PhotoServices() { clickOn(getPhotoServices());
    }
    public void PhotoCenter() { clickOn(getPhotoCenter());
    }
    public void PickToday() { clickOn(getPickToday());
    }
    public void christmasGift() { clickOn(getChristmasGift());
    }
    public void PhotoBook() { clickOn(getPhotoBook());
    }
    public void WallAart() {clickOn(getWallArt());
    }
    public void Posters() { clickOn(getPosters());
    }
    public void Gifts() { clickOn(getGifts());
    }


}