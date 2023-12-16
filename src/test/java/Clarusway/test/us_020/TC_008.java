package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_008 {

/*
    1-Kullanıcı checkout ekranına  gider
    2-Kullanıcı Billing adres alanının boş olduğunu doğrular
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
        Assert.assertNotEquals(" ",cp.billingAddress.getText());

        Driver.closeDriver();

    }

}
