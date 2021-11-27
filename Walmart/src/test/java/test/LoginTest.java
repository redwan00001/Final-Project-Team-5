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
                loginPage.getSignInAccount();
                waitFor(3);
        }
        @Test
        public void SignIn2() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage .class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                waitFor(3);
        }
        @Test
        public void CreateAnAccount3() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                loginPage.getCreateAnAccount();
        }
        @Test
        public void PurchaseHistory4() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                loginPage.getCreateAnAccount();
                loginPage.getPurchaseHistory();
        }
        @Test
        public void Email5() {
                TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                loginPage.getCreateAnAccount();
                loginPage.getPurchaseHistory();
                loginPage.getEmail();
        }

        @Test
        public void Password6() {
                TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
                }.getClass().getEnclosingMethod().getName()));
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                loginPage.getCreateAnAccount();
                loginPage.getPurchaseHistory();
                loginPage.getEmail();
                loginPage.getPassword();
        }
        @Test
        public void ForgotPassword7() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                loginPage.getCreateAnAccount();
                loginPage.getPurchaseHistory();
                loginPage.getEmail();
                loginPage.getPassword();
                loginPage.getForgotPassword();
        }
        @Test
        public void ShowPassword8() throws InterruptedException {
                LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                loginPage.getCreateAnAccount();
                loginPage.getPurchaseHistory();
                loginPage.getEmail();
                loginPage.getPassword();
                loginPage.getForgotPassword();
                loginPage.getShowPassword();
        }
        @Test
        public void EnterSignIn9() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
                loginPage.getSignInAccount();
                loginPage.getSignIn();
                loginPage.getCreateAnAccount();
                loginPage.getPurchaseHistory();
                loginPage.getEmail();
                loginPage.getPassword();
                loginPage.getForgotPassword();
                loginPage.getEnterSignIn();
        }


        }

