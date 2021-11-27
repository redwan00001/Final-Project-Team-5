package test;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LoginPage;
import reporting.TestLogger;

public class LoginTest extends CommonAPI {


        @Test
        public void SignInAccount1() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.clickOnSignInAccount();
                waitFor(3);
        }
        @Test
        public void SignIn2() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage .class);
                loginPage.clickOnSignInAccount();
                loginPage.clickOnSignIn();
                waitFor(3);
        }
        @Test
        public void CreateAnAccount3() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.clickOnSignInAccount();
                loginPage.clickOnSignIn();
                loginPage.clickOnCreateAnAccount();
        }
        @Test
        public void PurchaseHistory4() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.clickOnSignInAccount();
                loginPage.clickOnSignIn();
                loginPage.clickOnCreateAnAccount();
                loginPage.clickOnPurchaseHistory();
        }

        @Test
        public void ForgotPassword() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.clickOnSignInAccount();
                loginPage.clickOnSignIn();
                loginPage.clickOnForgotPassword();
        }
}

