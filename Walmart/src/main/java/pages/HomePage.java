package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/form/div/input")
    WebElement search;

   public WebElement getSearch() {
       return search;
   }
    public void clickOnSearch() {
        clickOn(getSearch());
    }

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/form/div/button")
    WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }
    public void clickOnSearchButton() {
        clickOn(getSearchButton());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[1]/div/div/section[2]/div[1]/ul/li[1]/button")
    WebElement chickenBreasts;

    public WebElement getChickenBreasts() {
        return chickenBreasts;
    }
    public void clickOnChickenBreasts() {
        clickOn(getChickenBreasts());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[1]/div")
    WebElement department;

   public WebElement getDepartment() {
       return department;
   }
    public void clickOnDepartment() {
        Actions action = new Actions(driver);
        action.moveToElement(department).perform();
        clickOn(getDepartment());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[1]/div/div/div/a")
    WebElement allDepartment;

    public WebElement getAllDepartment() {

        return allDepartment;
    }
    public void clickOnAllDepartment() {
        clickOn(getAllDepartment());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[4]/a")
    WebElement men;

    public WebElement getMen() {

        return men;
    }
    public void clickOnMen() {
        clickOn(getMen());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement girls;

    public WebElement getGirls() {

        return girls;
    }
    public void clickOnGirls() {
        clickOn(getGirls());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[6]/a")
    WebElement boys;

    public WebElement getBoys() {

        return boys;
    }
    public void clickOnBoys() {
        clickOn(getBoys());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement women;

    public WebElement getWomen() {

        return women;
    }
    public void clickOnWomen() {
        clickOn(getWomen());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[8]/a")
    WebElement shoes;

    public WebElement getShoes() {
        return shoes;
    }
    public void clickOnShoes() {
        clickOn(getShoes());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[3]/button")
    WebElement activewear;

    public WebElement getActivewear() {

        return activewear;
    }
    public void clickOnActivewear() {
        clickOn(getActivewear());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[4]/button")
    WebElement graphicTees;

    public WebElement getGraphicTees() {
        return graphicTees;
    }
    public void clickOnGraphicTees() {
        clickOn(getGraphicTees());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[5]/button")
    WebElement jeans;

    public WebElement getJeans() {
        return jeans;
    }
    public void clickOnJeans() {
        clickOn(getJeans());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[8]/button")
    WebElement socks;

    public WebElement getSocks() {
        return socks;
    }
    public void clickOnSocks() {
        clickOn(getSocks());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[9]/button")
    WebElement pants;

    public WebElement getPants() {
        return pants;
    }
    public void clickOnPants() {
        clickOn(getPants());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[14]/button")
    WebElement shorts;

    public WebElement getShorts() {
        return shorts;
    }
    public void clickOnShorts() {
        clickOn(getShorts());
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[15]/button")
    WebElement suits;

    public WebElement getSuits() {
        return suits;
    }
    public void clickOnSuits() {
        clickOn(getSuits());
    }

}

