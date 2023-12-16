package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_001 {

/*
    1-Kullanıcı ana ekrana gider
    2-Kullanıcı checkout sekmesine tıklar
    3-Kullanıcı checkout ekranının geldiğini doğrular
*/


    @Test
    public void test()  {
        CheckoutPage cp = new CheckoutPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        cp.homePageCheckoutButton.click();


        Assert.assertEquals(cp.checkoutButton.getText(), "Checkout");

        Driver.closeDriver();





    }

}
