package test;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import base.CommonAPI;

public class HomeTest extends CommonAPI{

    @Test
    public void Mac() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
       homePage.clickOnCancel();
        homePage.clickOnLaptopAndComputer();
        waitFor(1);
        homePage.clickOnMacbook();
        waitFor(1);

    }
}
