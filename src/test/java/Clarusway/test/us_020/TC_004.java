package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_004 {

/*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı sepete bir ürün ekler
    3-Kullanıcı checkout sekmesine tıklar
    4-Kullanıcı checkout ekranınında checkout butonuna tıklar
    5-Kullanıcı contact number alanında numara görünmediğini doğrular
*/


    @Test
    public void test()  {
        CheckoutPage cp = new CheckoutPage();
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

       CheckoutPage.loginWithCheckout(loginPage,cp);
        ReusableMethods.waitFor(2);
       cp.updateButton.click();
        ReusableMethods.waitFor(2);

        System.out.println(cp.contactNumber.getAttribute("value"));
        Assert.assertNotEquals(" ", cp.contactNumber.getAttribute("value"));

        Driver.closeDriver();

    }

}
