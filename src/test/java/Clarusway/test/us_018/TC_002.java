package Clarusway.test.us_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_002 {
    /*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı login sekmesine tıklar
    3-Kullanıcı valid email girer "vixogek800@bikedid.com"
    4-Kullanıcı "Forget Password" seçeneğine tıklar
    5-Kullanıcı şifre yenileme için yeniden email istenen ekranın geldiğini doğrular
*/
    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        loginPage.joinButton.click();
        loginPage.emailLogin.sendKeys("vixogek800@bikedid.com");
        loginPage.forgotPasswordButton.click();

        Assert.assertTrue(loginPage.submitEmailButton.isDisplayed());





        Driver.closeDriver();





    }



}
