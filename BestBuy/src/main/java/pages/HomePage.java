package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI{


    public WebElement getCancel() {
        return cancel;
    }

    @FindBy (xpath = "//*[@id=\"widgets-view-email-modal-mount\"]/div/div/div[1]/div/div/div/div/button")
    WebElement cancel;

    @FindBy( xpath = "//img[@alt='Laptops & Computers']")
    WebElement laptopAndComputer;

    @FindBy (xpath = "//span[normalize-space()='MacBooks']")
    WebElement macbook;


    public WebElement getLaptopAndComputer() {
        return laptopAndComputer;
    }
    public WebElement getMacbook() {
        return macbook;
    }


    public void clickOnCancel(){
        clickOn(getCancel());
    }
    public void clickOnLaptopAndComputer() {
        clickOn(getLaptopAndComputer());
    }
    public void clickOnMacbook() {
        clickOn(getMacbook());
    }


}
