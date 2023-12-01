package Clarusway.test.us_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_001 {
    /*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı login sekmesine tıklar
    3-Kullanıcı valid email girer "vixogek800@bikedid.com"
    4-Kullanıcı valid password girer "abc123"
    5-Kullanıcı login sekmesine tıklar
    6-Kullanıcı lolgin olduğunu doğrular
*/
    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));



        loginPage.joinButton.click();
        loginPage.emailLogin.sendKeys("vixogek800@bikedid.com");
        loginPage.passwordLogin.sendKeys("abc123");
        loginPage.loginButton.click();

        Assert.assertTrue(loginPage.personİmage.isDisplayed());

        Driver.closeDriver();





    }



}
