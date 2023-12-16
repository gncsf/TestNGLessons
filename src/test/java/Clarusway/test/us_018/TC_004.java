package Clarusway.test.us_018;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_004 {
    /*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı login sekmesine tıklar
    3-Kullanıcı herhangi bir password girer
    4-Kullanıcı girdiği password'ün .... şeklinde göründüğünü doğrular
*/
    @Test
    public void test() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        loginPage.joinButton.click();
        loginPage.passwordLogin.sendKeys("abc123");

        Assert.assertEquals("password", loginPage.passwordLogin.getAttribute("type"));

        Driver.closeDriver();





    }



}
