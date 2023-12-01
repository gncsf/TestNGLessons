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


    public static void loginWithCheckout( LoginPage loginPage,CheckoutPage cp) {
        cp.homePageCheckoutButton.click();
        cp.checkoutButton.click();
        loginPage.emailLogin.sendKeys("vixogek800@bikedid.com");
        loginPage.passwordLogin.sendKeys("abc123");
        loginPage.loginButton.click();
    }



}
