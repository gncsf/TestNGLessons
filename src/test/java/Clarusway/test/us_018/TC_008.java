package Clarusway.test.us_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_008 {
    /*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı login sekmesine tıklar
    3-Kullanıcı "Login with Mobile Number" alanına tıklar
    4-Kullanıcı telefon numarasını girer
    5-Kullanıcı "Send OTP" alanına tıklar
    6-Kullanıcı "Verify Code" alanının açıldığını doğrular
*/
    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        loginPage.joinButton.click();
        loginPage.loginWithNumberButton.click();
        loginPage.loginWithNumberEnter.sendKeys("5453332211");
        loginPage.sendOTPButton.click();

        Assert.assertTrue(loginPage.verifyCodeButton.isDisplayed());

        Driver.closeDriver();





    }



}
