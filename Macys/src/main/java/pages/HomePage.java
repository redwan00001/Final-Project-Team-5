package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{

    @FindBy( xpath = "//*[@id=\"flexid_1\"]/a/span")
    WebElement men;

    @FindBy (xpath = "//*[@id=\"categoryTree\"]/ul/li[4]/div[1]/div/div/ul/li[5]/a")
    WebElement menDressShirt;

    public WebElement getMen() {
        return men;
    }
    public WebElement getMenDressShirt() {
        return menDressShirt;
    }


    public void clickOnMen() {
        clickOn(getMen());
    }
    public void clickOnMenDressShirt() {
        clickOn(getMenDressShirt());
    }


}
