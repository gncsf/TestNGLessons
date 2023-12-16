package Clarusway.bazarLocaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pickBazar.utilities.Driver;

public class CheckoutPage {

    public CheckoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[contains(@class,'bg-light')]")// checkout butonu ana sayfadaki
    public WebElement homePageCheckoutButton;
    @FindBy(xpath = "//span[.='Checkout']")// checkout butonu kasanın içindeki
    public WebElement checkoutButton;
    @FindBy(xpath = "//p[.='Login with your email & password']")// login ekranı login yazısı
    public WebElement loginText;
    @FindBy(xpath = "(//input[contains(@type,'tel')])[2]")// update içindeki contact number
    public WebElement contactNumber;
    @FindBy(xpath = "(//button[contains(@class,'flex items')])[2]")// update butonu
    public WebElement updateButton;
    @FindBy(xpath = "//div[@class='flag us']")// bayrak simgesi
    public WebElement flagButton;
    @FindBy(xpath = "(//button[contains(@class,'inline')])[3]")// update contact butonu
    public WebElement updateContactButton;
    @FindBy(xpath = "(//p[contains(@class,'text-sm')])[2]")// billing adres alanı
    public WebElement billingAddress;
    @FindBy(xpath = "(//span[.='Add'])[1]")// ürün ekleme
    public WebElement add1;
    @FindBy(xpath = "(//span[.='Add'])[2]")// ürün ekleme
    public WebElement add2;
    @FindBy(xpath = "(//span[.='Add'])[3]")// ürün ekleme
    public WebElement add3;
    @FindBy(xpath = "(//button[contains(@class,'flex items')])[3]")// add BA butonu
    public WebElement addBillingAdressButton;
    @FindBy(xpath = "//input[@id='title']")// title butonu
    public WebElement addTitleButton;
    @FindBy(xpath = "//input[@id='address.country']")// t
    public WebElement addCountryButton;
    @FindBy(xpath = "//input[@id='address.city']")//
    public WebElement addCityButton;
    @FindBy(xpath = "//input[@id='address.state']")//
    public WebElement addStateButton;
    @FindBy(xpath = "//input[@id='address.zip']")//
    public WebElement addZIPButton;
    @FindBy(xpath = "//textarea[@id='address.street_address']")//
    public WebElement addStreetAddressButton;




    public static void loginWithCheckout( LoginPage loginPage,CheckoutPage cp) {
        cp.homePageCheckoutButton.click();
        cp.checkoutButton.click();
        loginPage.emailLogin.sendKeys("vixogek800@bikedid.com");
        loginPage.passwordLogin.sendKeys("abc123");
        loginPage.loginButton.click();
    }
    public static void addProducts (CheckoutPage cp) {
        cp.add1.click();
        cp.add2.click();
        cp.add3.click();
    }
    public static void addAddress ( CheckoutPage cp) {
        cp.addTitleButton.sendKeys("Home");
        cp.addCountryButton.sendKeys("Tukiye");
        cp.addCityButton.sendKeys("Samsun");
        cp.addStateButton.sendKeys("Merkez");
        cp.addZIPButton.sendKeys("55000");
        cp.addStreetAddressButton.sendKeys("ev adresi burasi");
        cp.updateContactButton.click();

    }



}
