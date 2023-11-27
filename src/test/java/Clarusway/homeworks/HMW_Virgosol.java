package Clarusway.homeworks;

  /*
    Amazon Senaryosu
https://www.amazon.com.tr/ sitesi açılır.
//Ana sayfanın açıldığı kontrol edilir.
//Çerez tercihlerinden Çerezleri kabul et seçilir.
//Siteye login olunur.
//Login işlemi kontrol edilir.
//Hesabım bölümünden “Virgosol Liste” isimli yeni bir liste oluşturulur.
//Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
//Bilgisayar kategorisi seçildiği kontrol edilir.
//Arama alanına msi yazılır ve arama yapılır.
//Arama yapıldığı kontrol edilir.
//Arama sonuçları sayfasından 2. sayfa açılır.
//2'inci sayfanın açıldığı kontrol edilir.
//Sayfadaki 2'inci ürün oluşturulan “Virgosol Liste” listesine eklenir.
//2'inci Ürünün listeye eklendiği kontrol edilir.
//Hesabım  Alışveriş Listesi sayfasına gidilir.
//“Alışveriş Listesi” sayfası açıldığı kontrol edilir.
//Eklenen ürün Virgosol Liste’sinden silinir.
//Silme işleminin gerçekleştiği kontrol edilir.
//Virgosol Liste'si silinir.
//Üye çıkış işlemi yapılır.
//Çıkış işleminin yapıldığı kontrol edilir.
//Not: Virgosol Liste'si task yeniden çalıştırıldığında sorun olmaması için silinmektedir.
     */

import Clarusway.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HMW_Virgosol extends TestBase {

    /*
      Amazon Senaryosu
  //https://www.amazon.com.tr/ sitesi açılır.
  //Ana sayfanın açıldığı kontrol edilir.
  //Çerez tercihlerinden Çerezleri kabul et seçilir.
  //Siteye login olunur.
  //Login işlemi kontrol edilir.
  //Hesabım bölümünden “Virgosol Liste” isimli yeni bir liste oluşturulur.
  //Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
  //Bilgisayar kategorisi seçildiği kontrol edilir.
  //Arama alanına msi yazılır ve arama yapılır.
  //Arama yapıldığı kontrol edilir.
  //Arama sonuçları sayfasından 2. sayfa açılır.
  //2'inci sayfanın açıldığı kontrol edilir.
  //Sayfadaki 2'inci ürün oluşturulan “Virgosol Liste” listesine eklenir.
  //2'inci Ürünün listeye eklendiği kontrol edilir.
  //Hesabım  Alışveriş Listesi sayfasına gidilir.
  //“Alışveriş Listesi” sayfası açıldığı kontrol edilir.
  //Eklenen ürün Virgosol Liste’sinden silinir.
  //Silme işleminin gerçekleştiği kontrol edilir.
  //Virgosol Liste'si silinir.
  //Üye çıkış işlemi yapılır.
  //Çıkış işleminin yapıldığı kontrol edilir.
  //Not: Virgosol Liste'si task yeniden çalıştırıldığında sorun olmaması için silinmektedir.
       */
    @Test
    public void virgosol(){
        JavascriptExecutor jse = ((JavascriptExecutor) driver);

//https://www.amazon.com.tr/ sitesi açılır.
        driver.get("https://www.amazon.com.tr/");
//Ana sayfanın açıldığı kontrol edilir.
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon.com.tr"));

//Çerez tercihlerinden Çerezleri kabul et seçilir.
        WebElement çerez = driver.findElement(By.id("sp-cc-accept"));
        if(çerez.isDisplayed()){çerez.click();}

//Siteye login olunur.
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.id("ap_email")).sendKeys("gncsefa.55@gmail.com");
        driver.findElement(By.cssSelector("span#continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Cerencansu.55"+Keys.ENTER);

//Login işlemi kontrol edilir.
        Assert.assertTrue(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText().contains("Sefa"));
        Assert.assertFalse(driver.findElement(By.xpath("//a[@id='nav-link-accountList']/div")).getText().contains("Giriş"));

//Hesabım bölümünden “Virgosol Liste” isimli yeni bir liste oluşturulur.
        driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
        driver.findElement(By.xpath("(//span[@class='a-color-secondary'])[9]")).click();
        driver.findElement(By.xpath("//*[text( )= 'Bir liste oluştur']")).click();
        driver.findElement(By.id("list-name")).clear();
        driver.findElement(By.id("list-name")).sendKeys("Virgosol Liste");
        driver.findElement(By.xpath("(//input[@class='a-button-input a-declarative'])[3]")).click();

//Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
        driver.navigate().refresh();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='nav-search-facade']")));
        WebElement kategorilerDropDown = driver.findElement(By.id("searchDropdownBox"));
        Select select = new Select(kategorilerDropDown);
        select.selectByValue("search-alias=computers");

//Bilgisayar kategorisi seçildiği kontrol edilir.
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("Bilgisayar"));

//Arama alanına msi yazılır ve arama yapılır.
        actions.click(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys("msi" + Keys.ENTER).perform();

//Arama yapıldığı kontrol edilir.
        WebElement arananUrun = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        Assert.assertTrue(arananUrun.getText().contains("msi"));

//Arama sonuçları sayfasından 2. sayfa açılır.
        actions.click(driver.findElement(By.xpath("//a[@aria-label='2 sayfasına git']"))).perform();

//2'inci sayfanın açıldığı kontrol edilir.
        Assert.assertEquals("2",driver.findElement(By.xpath("//span[@aria-label='Geçerli sayfa, sayfa 2']")).getText());

//Sayfadaki 2'inci ürün oluşturulan “Virgosol Liste” listesine eklenir.
        driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base'])[2]")).click();
        driver.findElement(By.id("add-to-wishlist-button-submit")).click();

//2'inci Ürünün listeye eklendiği kontrol edilir.
        Assert.assertTrue(driver.findElement(By.xpath("//*[.='1 ürün şuraya eklendi:']")).isDisplayed());

//Hesabım  Virgosol Listesi sayfasına gidilir.
        driver.findElement(By.xpath("//button[@data-action='a-popover-close']")).click();
        driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
        driver.findElement(By.xpath("(//span[@class='a-color-secondary'])[9]")).click();

//“Virgosol Listesi” sayfası açıldığı kontrol edilir.
        Assert.assertTrue(driver.findElement(By.id("profile-list-name")).getText().toLowerCase().contains("virgosol"));

//Eklenen ürün Virgosol Liste’sinden silinir.
        driver.findElement(By.name("submit.deleteItem")).click();
//Silme işleminin gerçekleştiği kontrol edilir.
        Assert.assertTrue(driver.findElement(By.xpath("(//div[.='Silindi'])[2]")).isDisplayed());

//Virgosol Liste'si silinir.
        WebElement dahaFazlası= driver.findElement(By.id("overflow-menu-popover-trigger"));
        jse.executeScript("arguments[0].click();", dahaFazlası);

        WebElement listeyiYönet = driver.findElement(By.id("editYourList"));

        jse.executeScript("arguments[0].click();", listeyiYönet);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        WebElement listeyiSil= driver.findElement(By.xpath("//span[contains(text(),'Listeyi sil')]"));

        jse.executeScript("arguments[0].click();", listeyiSil);
        jse.executeScript("arguments[0].click();",driver.findElement(By.name("submit.save")));

        //Üye çıkış işlemi yapılır.
        WebElement hesaplar= driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        actions.moveToElement(hesaplar)
                .perform();

        WebElement cikisYap= driver.findElement(By.xpath("//span[contains(text(),'Çıkış Yap')]"));

        jse.executeScript("arguments[0].click();",cikisYap );

        //Çıkış işleminin yapıldığı kontrol edilir.
        Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'Giriş yap')]")).getText().contains("Giriş yap"));

//Not: Virgosol Liste'si task yeniden çalıştırıldığında sorun olmaması için silinmektedir.
    }
}
