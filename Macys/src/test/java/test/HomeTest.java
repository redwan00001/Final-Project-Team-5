package test;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;
import base.CommonAPI;

public class HomeTest extends CommonAPI{

    @Test
    public void Men() {

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMen();
        waitFor(2);
        homePage.clickOnMenDressShirt();
        waitFor(1);
    }
}
