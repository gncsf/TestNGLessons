package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_009 {

/*
    1-Kullanıcı checkout ekranına  gider
    2-Kullanıcı Billing adres alanında adresin görünebilir olduğunu doğrular
*/


    @Test
    public void test()  {
        CheckoutPage cp = new CheckoutPage();
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

       CheckoutPage.addProducts(cp);
        CheckoutPage.loginWithCheckout(loginPage,cp);
        ReusableMethods.waitFor(1);

        System.out.println(cp.billingAddress.getText());
        Assert.assertEquals("2231 Kidd Avenue, AK, Kipnuk, 99614, United States",cp.billingAddress.getText());

        Driver.closeDriver();

    }

}
