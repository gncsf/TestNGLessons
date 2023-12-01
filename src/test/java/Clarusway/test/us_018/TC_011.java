package Clarusway.test.us_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_011 {
    /*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı login sekmesine tıklar
    3-Kullanıcı "Register" butonuna tıklar
    4-Kullanıcı "Register" ekraninda(Already have an account?) "Login" butonuna tıklar
    5-Kullanıcı login ekranının açıldığını doğrular
*/
    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        loginPage.joinButton.click();
        loginPage.registerButton.click();
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.forgotPasswordButton.isDisplayed());

        Driver.closeDriver();





    }



}
