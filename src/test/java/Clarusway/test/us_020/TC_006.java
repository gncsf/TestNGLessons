package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_006 {

/*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı checkout sekmesine tıklar
    3-Kullanıcı checkout ekranınında checkout butonuna tıklar
    4-Kullanıcı contact number seçili olan alan kodunun ülke bayrağının göründünü doğrular
*/


    @Test
    public void test()  {
        CheckoutPage cp = new CheckoutPage();
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

       CheckoutPage.loginWithCheckout(loginPage,cp);
        ReusableMethods.waitFor(2);

        Assert.assertEquals("flag us", cp.flagButton.getAttribute("class"));

        Driver.closeDriver();

    }

}
