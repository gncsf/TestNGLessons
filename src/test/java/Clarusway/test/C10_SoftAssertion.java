package Clarusway.test;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class C10_SoftAssertion extends TestBase {

    //Test Case2: Negative Username Test
    //Open page https://practicetestautomation.com/practice-test-login/
    //Type username incorrectUser into Username field.
    //Type password Password123 into Password field.
    //click Submit button.
    //Verify error message is displayed.
    //Verify error message text is Your username is invalid!

    @Test
    public void negativeUserNameTestSoft() {
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("incorrectUser");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();


        SoftAssert sa = new SoftAssert();

        sa.assertTrue(driver.findElement(By.xpath("//div[@id='error']")).isDisplayed());
        sa.assertTrue(driver.findElement(By.xpath("//div[@id='error']"))
                .getText().contains("Your username is invalid!"));
        sa.assertAll();


    }

}
