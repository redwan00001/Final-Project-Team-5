package loginpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends CommonAPI {

    @Test
    public void verifySearch() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getSearch().sendKeys("chicken", Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);
        waitFor(30);
        homePage.clickOnSearchButton();
        waitFor(30);
        homePage.clickOnChickenBreasts();
        waitFor(30);

    }

//    @Test
    public void Department() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.clickOnDepartment();




    }

   // @Test
    public void verifyMenActivewear() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnActivewear();
        waitFor(1);
    }

  //  @Test
    public void verifyMenActivewearShorts() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDepartment();
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

   // @Test
    public void verifyWomenActivewear() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnWomen();
        waitFor(1);
        homePage.clickOnActivewear();
        waitFor(1);
    }

    //@Test
    public void verifyWomenActivewearShoes() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDepartment();
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

   // @Test
    public void verifyMenGraphicTees() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnDepartment();
        waitFor(1);
        homePage.clickOnAllDepartment();
        waitFor(1);
        homePage.clickOnMen();
        waitFor(1);
        homePage.clickOnGraphicTees();
        waitFor(1);
    }

  //  @Test
    public void verifyMenJeans() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getMen().click();
        waitFor(1);
        homePage.getJeans().click();
        waitFor(1);
    }
  //  @Test
    public void verifyMenSuits() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getMen().click();
        waitFor(1);
        homePage.getSuits().click();
        waitFor(1);
    }

  //  @Test
    public void verifyMenSocks() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getMen().click();
        waitFor(1);
        homePage.getSocks().click();
        waitFor(1);
    }

   // @Test
    public void verifyMenPants() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getMen().click();
        waitFor(1);
        homePage.getPants().click();
        waitFor(1);
    }

  //  @Test
    public void verifyMenShorts() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getMen().click();
        waitFor(1);
        homePage.getShorts().click();
        waitFor(1);
    }
   // @Test
    public void verifyWomenGraphicTees() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getWomen().click();
        waitFor(1);
        homePage.getGraphicTees().click();
        waitFor(1);
    }
   // @Test
    public void verifyWomenJeans() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getWomen().click();
        waitFor(1);
        homePage.getJeans().click();
        waitFor(1);
    }
    //@Test
    public void verifyWomenPants() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getWomen().click();
        waitFor(1);
        homePage.getPants().click();
        waitFor(1);
    }
   // @Test
    public void verifyWomenShorts() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getWomen().click();
        waitFor(1);
        homePage.getShorts().click();
        waitFor(1);
    }
    //@Test
    public void verifyWomenShoes() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getDepartment().click();
        waitFor(1);
        homePage.getAllDepartment().click();
        waitFor(1);
        homePage.getWomen().click();
        waitFor(1);
        homePage.getShoes().click();
        waitFor(1);
    }

}
