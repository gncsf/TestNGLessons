package Clarusway.test.us_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_008 {

    /*
    1- Kullanıcı books ekranına gider
    2-Kullanıcı books ekranında "PickBazar" butonu olduğunu doğrular
    3- Kullanıcı "PickBazar" butonu tıklar
    4-Kullanıcı  "PickBazar" butonuna basarak ana sayfaya döndüğünü doğrular
     */

    @Test
    public void test() throws InterruptedException {


        HomePage homePage=new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.menuButton.click();
        homePage.menuBooksButton.click();
        homePage.pickBazarButon.click();

        Assert.assertTrue(homePage.menuGroceryButtonHomePAge.isDisplayed());

        Driver.closeDriver();



    }




}


