package Clarusway.bazarLocaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pickBazar.utilities.Driver;


public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Join']")// ana ekran login olma butonu
    public WebElement joinButton;

    @FindBy(xpath = "//input[@id='email']")// login ekranı email giriş
    public WebElement emailLogin;
    @FindBy(xpath = "//input[@id='password']")// login ekranı password giriş
    public WebElement passwordLogin;
    @FindBy(xpath = "//button[.='Login']")// login ekranı login butonu
    public WebElement loginButton;
    @FindBy(xpath = "//button[.='Login with Google']")// login ekranı google login olma butonu
    public WebElement loginWithGoogleButton;
    @FindBy(xpath = "//body[.='Internal Server Error']")// login ekranı google login olma hata ekranı
    public WebElement loginWithGoogleButtonFail;

    @FindBy(xpath = "//button[.='Login with Mobile number']")// login ekranı numara ile login olma butonu
    public WebElement loginWithNumberButton;
    @FindBy(xpath = "//img[@alt='user name']")// login olduktan sonra gelen kullanıcı resmi
    public WebElement personİmage;
    @FindBy(xpath = "//button[.='Forgot password?']")// login ekranı forgot password seçeneği
    public WebElement forgotPasswordButton;
    @FindBy(xpath = "//button[.='Submit Email']")// login ekranı submit email password seçeneği
    public WebElement submitEmailButton;
    @FindBy(xpath = "(//label[@for='password'])[2]")// login password gizleme açma butonu
    public WebElement passwordEyeButton;
    @FindBy(xpath = "//p[contains(@class,'mt')]")// login number ekranı text i
    public WebElement loginWithNumberText;
    @FindBy(xpath = "//input[contains(@class,'form')]")// login number ekranı numara girme alanı
    public WebElement loginWithNumberEnter;
    @FindBy(xpath = "//button[.='Send OTP']")// send OTP button
    public WebElement sendOTPButton;
    @FindBy(xpath = "//button[.='Verify Code']")// verify code button
    public WebElement verifyCodeButton;
    @FindBy(xpath = "//button[.='Register']")// login ekranı register button
    public WebElement registerButton;
    @FindBy(xpath = "//input[@id='name']")//  register ekranı name yazma alanı
    public WebElement registerNameLogin;








}
