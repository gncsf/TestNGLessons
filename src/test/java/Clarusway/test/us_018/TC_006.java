package Clarusway.test.us_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_006 {
    /*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı login sekmesine tıklar
    3-Kullanıcı "login google account" alanına tıklar
    4-Kullanıcı "login google account" alanının çalıştğını doğrular
*/
    @Test
    public void test() {

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));



            LoginPage loginPage = new LoginPage();
            loginPage.joinButton.click();
            loginPage.loginWithGoogleButton.click();
            ReusableMethods.waitFor(3);

            Assert.assertEquals(loginPage.loginWithGoogleButtonFail.getText(), "Internal Server Error");

            Driver.closeDriver();


    }



}
