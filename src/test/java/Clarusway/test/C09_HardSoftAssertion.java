package Clarusway.test;

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C09_HardSoftAssertion extends TestBase {

      /*
    Test Case1: Positive Login Test
    Open page https://practicetestautomation.com/practice-test-login/
    Type username student into Username field
    Type password Password123 into Password field
    Puch Submit button.
    Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    Verify button Log out is displayed on the new page.
     */

    @Test
    public void testLoginHard(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        Assert.assertTrue(driver.findElement(By.tagName("strong")).getText().contains("Congratulations")||
                driver.findElement(By.tagName("strong")).getText().contains("successfully logged in"));
        Assert.assertTrue(driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed());



    }

    @Test
    public void testLoginSoft(){
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("student");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        SoftAssert sa = new SoftAssert();

        sa.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        sa.assertTrue(driver.findElement(By.tagName("strong")).getText().contains("Congratulations")||
                driver.findElement(By.tagName("strong")).getText().contains("successfully logged in"));
        sa.assertTrue(driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed());
        sa.assertAll();




    }



    }
