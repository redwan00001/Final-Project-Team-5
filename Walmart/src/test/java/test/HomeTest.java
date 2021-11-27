package test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends CommonAPI {


    @Test
    public void Department1() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(2);

    }



    @Test
    public void ViewAll2() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnViewAll();
    }


    @Test
    public void verifyMenActivewear3() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnActivewear();
        waitFor(1);
    }

    @Test
    public void verifyMenActivewearPants4() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnActivewear();
        waitFor(1);
        homePage.clickOnPants();
    }

    @Test
    public void verifyMenActivewearShorts5() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnActivewear();
        waitFor(1);
        homePage.clickOnShorts();
        waitFor(1);
    }

    @Test
    public void verifyWomenActivewear6() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnActivewear();
        waitFor(1);
    }

    @Test
    public void verifyWomenActivewearShoes7() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnActivewear();
        waitFor(1);
        homePage.clickOnShoes();
        waitFor(1);
    }

    @Test
    public void verifyMenGraphicTees8() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnGraphicTees();
        waitFor(1);
    }

    @Test
    public void verifyMenJeans9() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnJeans();
        waitFor(1);
    }

    @Test
    public void verifyMenSuits10() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnSuits();
        waitFor(1);
    }

    @Test
    public void verifyMenSocks11() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnSocks();
        waitFor(1);
    }

    @Test
    public void verifyMenPants12() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnPants();
        waitFor(1);
    }

    @Test
    public void verifyMenShorts13() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnShorts();
        waitFor(1);
    }

    @Test
    public void verifyWomenGraphicTees14() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnGraphicTees();
        waitFor(1);
    }

    @Test
    public void verifyWomenJeans15() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnJeans();
        waitFor(1);
    }

    @Test
    public void verifyWomenPants16() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnPants();
        waitFor(1);
    }

    @Test
    public void verifyWomenShorts17() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnShorts();
        waitFor(1);
    }

    @Test
    public void verifyWomenShoes18() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.hoverOverDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnShorts();
        waitFor(1);
    }


}