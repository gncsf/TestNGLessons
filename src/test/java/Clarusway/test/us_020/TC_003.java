package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_003 {

/*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı checkout sekmesine tıklar
    3-Kullanıcı checkout ekranınında checkout butonuna tıklar
    4-Kullanıcı login ekranında email ve password girer
    5-Kullanıcı login butonuna tıklar
    6-Kullanıcı checout ekranının geldiğini doğrular
*/


    @Test
    public void test()  {
        CheckoutPage cp = new CheckoutPage();
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        cp.homePageCheckoutButton.click();
        cp.checkoutButton.click();
        loginPage.emailLogin.sendKeys("vixogek800@bikedid.com");
        loginPage.passwordLogin.sendKeys("abc123");
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.personİmage.isDisplayed());

        Driver.closeDriver();

    }

}
