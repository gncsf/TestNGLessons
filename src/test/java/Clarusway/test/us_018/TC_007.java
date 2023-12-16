package Clarusway.test.us_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_007 {
    /*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı login sekmesine tıklar
    3-Kullanıcı "Login with Mobile Number" alanına tıklar
    4-Kullanıcı numara girmesi istenen bölümün açlıldığını doğrular
*/
    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        loginPage.joinButton.click();
        loginPage.loginWithNumberButton.click();


        Assert.assertTrue(loginPage.loginWithNumberText.isDisplayed());

        Driver.closeDriver();





    }



}
