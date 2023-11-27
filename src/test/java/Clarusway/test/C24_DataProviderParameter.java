package Clarusway.test;
import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class C24_DataProviderParameter extends TestBase {
    @Test(dataProvider = "getData")
    public void test(String username, String password){
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement invalidWE = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
        Assert.assertTrue(invalidWE.isDisplayed());
    }

    @DataProvider(parallel = true)
    public Object[][] getData(){
        return new Object[][]{
                {"admin*","admin123"},
                {"admin12","123"}

        };
    }
}
