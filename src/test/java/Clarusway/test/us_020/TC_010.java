package Clarusway.test.us_020;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.CheckoutPage;
import pickBazar.pages.LoginPage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_010 {

/*
   1-Kullanıcı checkout ekranına  gider
    2-Kullanıcı billig adres  alanındaki "+ add" butonuna tıklar
    3-Kullanıcı açılan ekrana yeni adres bilgisini girer
    4-Kullanıcı "update address" butonuna tıklar
    5-Kullanıcı billing address alanındaki adresin yenilendiğini doğrular
*/


    @Test
    public void test()  {
        CheckoutPage cp = new CheckoutPage();
        LoginPage loginPage = new LoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

       CheckoutPage.addProducts(cp);
        CheckoutPage.loginWithCheckout(loginPage,cp);
        ReusableMethods.waitFor(1);
        cp.addBillingAdressButton.click();
        CheckoutPage.addAddress(cp);

        System.out.println(cp.billingAddress.getText());
        Assert.assertNotEquals("ev adresi burasi,Samsun,Merkez,55000,Turkiye",cp.billingAddress.getText());

        Driver.closeDriver();

    }

}
