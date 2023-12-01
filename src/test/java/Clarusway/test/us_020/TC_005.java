package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_005 {

/*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı checkout sekmesine tıklar
    3-Kullanıcı checkout ekranınında checkout butonuna tıklar
    4-Kullanıcı contact number numara ekli ise ekli olan numaranın göründünü doğrular
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


        Assert.assertEquals("+1 (936) 514-1641", cp.contactNumber.getAttribute("value"));

        Driver.closeDriver();

    }

}
