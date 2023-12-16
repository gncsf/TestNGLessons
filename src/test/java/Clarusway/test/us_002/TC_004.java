package Clarusway.test.us_002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_004 {

    /*
    1- Kullanıcı bags ekranına gider
    2-Kullanıcı bags ekranında  "PickBazar" butonu olduğunu doğrular
    3- Kullanıcı "PickBazar" butonu tıklar
    4-Kullanıcı  "PickBazar" butonuna basarak ana sayfaya döndüğünü doğrular
     */

    @Test
    public void test(){


        HomePage homePage=new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.menuButton.click();
        homePage.menuBagsButton.click();
        homePage.pickBazarButon.click();


        Assert.assertTrue(homePage.menuGroceryButtonHomePAge.isDisplayed());

        Driver.closeDriver();

    }




}


