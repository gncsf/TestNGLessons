package Clarusway.test.us_002;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_001 {

    /*
    1- Kullanıcı ana ekrana gider
    2-Kullanıcı ana ekranda  "PickBazar" butonu olduğunu doğrular
    3- Kullanıcı scroll yaparak sayfada aşağı iner
    4-Kullanıcı "PickBazar" butonu tıklar
    5-Kullanıcı  "PickBazar" butonuna basarak ana sayfaya döndüğünü doğrular
     */

    @Test
    public void test(){
        HomePage homePage=new HomePage();

        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.pickBazarButon.click();

        Assert.assertTrue(homePage.menuGroceryButtonHomePAge.isDisplayed());

        Driver.closeDriver();


    }




}


