package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonAPI {


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/form/div/input")
    WebElement search;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/form/div/button")
    WebElement searchButton;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[1]/div/div/section[2]/div[1]/ul/li[1]/button")
    WebElement chickenBreasts;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[1]/div")
    WebDriver department;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[1]/div/div/div/a")
    WebElement allDepartment;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[4]/a")
    WebElement men;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement girls;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[6]/a")
    WebElement boys;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement women;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[8]/a")
    WebElement shoes;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[3]/button")
    WebElement activewear;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[4]/button")
    WebElement graphicTees;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[5]/button")
    WebElement jeans;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[8]/button")
    WebElement socks;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[9]/button")
    WebElement pants;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[11]/button")
    WebElement shorts;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[15]/button")
    WebElement suits;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div/div/div/div/section/div[2]/div[2]/div/div[1]/ul/li[2]/a")
    WebElement pharmacy;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div/div[2]/div/div[1]/div/div/article/section/div/header/a")
    WebElement viewAll;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div/div[2]/div/div[1]/div/div/article/section/div/div/div[2]/a/img")
    WebElement autoCareCenter;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div/div/div/div/section/div[2]/div[2]/div/div[1]/h2/a")
    WebElement healthServices;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/div[2]/section/div/div[1]/a/img")
    WebElement tires;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/div[2]/section/div/div[2]/a/img")
    WebElement carBatteries;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/div[2]/section/div/div[3]/a/img")
    WebElement oilAndFluids;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[8]/button")
    WebElement allSeasonTires;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[3]/button")
    WebElement shopByBrand;



//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;
//
//    @FindBy (xpath = "")
//    WebElement ;






    public WebElement getHealthServices() {
     return healthServices;
    }
    public WebElement getAutoCareCenter() {
     return autoCareCenter;
    }
    public WebElement getViewAll() {
     return viewAll;
    }

    public WebElement getSuits() {
     return suits;
    }
    public WebElement getShorts() {
     return shorts;
    }
    public WebElement getPants() {
     return pants;
    }
    public WebElement getSocks() {
     return socks;
    }
    public WebElement getJeans() {
     return jeans;
    }
    public WebElement getGraphicTees() {
     return graphicTees;
    }
    public WebElement getActivewear() {
     return activewear;
    }
    public WebElement getSearch() {
     return search;
    }
    public WebElement getWomen() {
     return women;
     }
    public WebElement getShoes() {
     return shoes;
    }
    public WebElement getBoys() {
     return boys;
    }
    public WebElement getGirls() {
     return girls;
    }
    public WebElement getMen() {
     return men;
    }
    public WebElement getAllDepartment() {
     return allDepartment;
    }
    public WebDriver getDepartment() {
     return department;
    }
    public WebElement getChickenBreasts() {
     return chickenBreasts;
    }
    public WebElement getSearchButton() {
     return searchButton;
    }
    public WebElement getTires() {
     return tires;
    }
    public WebElement getCarBatteries() {
     return carBatteries;
    }
    public WebElement getOilAndFluids(){
     return oilAndFluids;
    }
    public WebElement getAllSeasonTires() {
     return allSeasonTires;
    }
    public WebElement getShopByBrand() {
     return shopByBrand;
    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }
//    public WebElement get() {
//        return ;
//    }






    public void clickOnSearchButton() {
    }
    public void clickOnChickenBreasts() {
    }

    public void clickOnAllDepartment() {
    }
    public void clickOnMen() {
    }
    public void clickOnGirls() {
    }
    public void clickOnBoys() {
    }
    public void clickOnShoes() {
    }
    public void clickOnWomen() {
    }
    public void clickOnActivewear() {
    }
    public void clickOnGraphicTees() {
    }
    public void clickOnJeans(){
    }
    public void clickOnSocks() {
    }
    public void clickOnPants() {
    }
    public void clickOnHealthServices(){
    }
    public void clickOnSearch() {
    }
    public void clickOnAutoCareCenter(){
    }
    public void clickOnViewAll() {
    }

    public void clickOnShorts() {
    }
    public void clickOnSuits() {
    }
    public void clickOnTires() {
    }
    public void clickOnCarBatteries() {
    }
    public void clickOnOilAndFluids() {
    }
    public void clickOnAllSeasonTires() {
    }
    public void clickOnShopByBrand() {
    }

//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }
//    public void clickOn() {
//    }


    public void hoverOverDepartment() {
    }
}

