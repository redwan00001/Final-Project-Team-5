package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/form/div/input")
    WebElement search;

   public WebElement getSearch() {
       return search;
   }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[1]/div")
    WebElement department;

   public WebElement getDepartment() {
       return department;
   }

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/span/header/div/div[1]/div/div/div/a")
    WebElement allDepartment;

    public WebElement getAllDepartment() {
        return allDepartment;
    }

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[4]/a")
    WebElement men;

    public WebElement getMen() {
        return men;
    }

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement girls;

    public WebElement getGirls() {
        return girls;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[6]/a")
    WebElement boys;

    public WebElement getBoys() {
        return boys;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[2]/a")
    WebElement women;

    public WebElement getWomen() {
        return women;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/section/div[2]/div[1]/div/div[1]/ul/li[8]/a")
    WebElement shoes;

    public WebElement getShoes() {
        return shoes;
    }


    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[3]/button")
    WebElement activewear;

    public WebElement getActivewear() {
        return activewear;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[4]/button")
    WebElement GraphicTees;

    public WebElement getGraphicTees() {
        return GraphicTees;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[5]/button")
    WebElement Jeans;

    public WebElement getJeans() {
        return Jeans;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[8]/button")
    WebElement Socks;

    public WebElement getSocks() {
        return Socks;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[9]/button")
    WebElement Pants;

    public WebElement getPants() {
        return Pants;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[14]/button")
    WebElement Shorts;

    public WebElement getShorts() {
        return Shorts;
    }
    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[2]/div/div/section[2]/div[1]/ul/li[15]/button")
    WebElement Suits;

    public WebElement getSuits() {
        return Suits;
    }
    public void clickOnDepartment() {
        clickOn(getDepartment());
    }

}

