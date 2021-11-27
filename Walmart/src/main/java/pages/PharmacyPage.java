package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import org.openqa.selenium.support.PageFactory;

public class PharmacyPage extends CommonAPI {

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div/div/div/div/section/div[2]/div[2]/div/div[1]/ul/li[2]/a")
    WebElement pharmacy;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/div[1]/div/ul/li[3]/button")
    WebElement fluShot;

    @FindBy (xpath = "//*[@id=\"cp-center-module-0\"]/div/div/div/div/a/span")
    WebElement scheduleNowFluShot;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/div[1]/div/ul/li[4]/button")
    WebElement digitalVaccineRecord;

    @FindBy (xpath = "//*[@id=\"cp-center-module-0\"]/div/div/div[2]/div[4]/a")
    WebElement digitalVaccineRecordViewNow;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/div[1]/div/ul/li[9]/button")
    WebElement diabetesCare;

    @FindBy (xpath = "//*[@id=\"cp-top-module-1\"]/div/div/div[2]/div[4]/a")
    WebElement diabetesCareShopNow;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[3]/div/div/div/section/div/div[1]/div/div/a")
    WebElement reliOnPrimeBloodGlucoseTestStrips;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div[3]/div/div/div/section/div/div[2]/div/div/a")
    WebElement reliOnPremierBloodGlucoseTestStrips;

    @FindBy (xpath = "//*[@id=\"d903a8dc-50b6-47e6-8192-4877c895005c-tileLink-0\"]")
    WebElement diabetesCareMonitors;

    @FindBy (xpath = "//*[@id=\"__next\"]/div[1]/div/div/div/div/main/div/div/div/div/div[1]/div/ul/li[12]/button")
    WebElement walmartHealth;

    @FindBy (xpath = "//*[@id=\"0\"]/div/div[2]/a/div")
    WebElement scheduleWalmartHealthVisit;

    @FindBy (xpath = "//*[@id=\"__next\"]/div/div/div/div/div/main/div[1]/div/div/div/div[2]/div[4]/div/div/div[1]/div[1]/div/div/input")
    WebElement walmartHealthZipCode;

    @FindBy (xpath = "//*[@id=\"maincontent\"]/div/div[2]/div/div[1]/div/div/article/section/div/header/a")
    WebElement viewAll;




    public WebElement getPharmacy() {
        return pharmacy;
    }
    public WebElement getViewAll() {
        return viewAll;
    }
    public WebElement getFluSHot() {
        return fluShot;
    }
    public WebElement getScheduleNowFluShot() {
        return scheduleNowFluShot;
    }
    public WebElement getDigitalVaccineRecord() {
        return digitalVaccineRecord;
    }
    public WebElement getDigitalVaccineRecordViewNow() {
        return digitalVaccineRecordViewNow;
    }
    public WebElement getDiabetesCare() {
        return diabetesCare;
    }
    public WebElement getDiabetesCareShopNow() {
        return diabetesCareShopNow;
    }
    public WebElement getReliOnPrimeBloodGlucoseTestStrips() {
        return reliOnPrimeBloodGlucoseTestStrips;
    }
    public WebElement getReliOnPremierBloodGlucoseTestStrips() {
        return reliOnPremierBloodGlucoseTestStrips;
    }
    public WebElement getDiabetesCareMonitors() {
        return diabetesCareMonitors;
    }
    public WebElement getWalmartHealth() {
        return walmartHealth;
    }
    public WebElement getScheduleWalmartHealthVisit() {
        return scheduleWalmartHealthVisit;
    }
    public WebElement getWalmartHealthZipCode() {
        return walmartHealthZipCode;
    }

    public void clickOnPharmacy() {
    }
    public void clickOnViewAll() {
    }
    public void clickOnFluShot() {
    }
    public void clickOnScheduleNowFluShot() {
    }
    public void clickOnDigitalVaccineRecord() {
    }
    public void clickOnDigitalVaccineRecordViewNow() {
    }
    public void clickOnDiabetesCare() {
    }
    public void clickOnDiabetesCareShopNow() {
    }
    public void clickOnReliOnPrimeBloodGlucoseTestStrips() {
    }
    public void clickOnReliOnPremierBloodGlucoseTestStrips() {
    }
    public void clickOnDiabetesCareMonitors() {
    }
    public void clickOnWalmartHealth() {
    }
    public void clickOnScheduleWalmartHealthVisit() {
    }
    public void clickOnWalmartHealthZipCode() {
    }
}
