
package Clarusway.bazarLocaters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pickBazar.utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[.='Grocery'])[1]")// ana ekrandaki grocery yazısı
    public WebElement menuGroceryButtonHomePAge;

    @FindBy(xpath = "//span[@class='whitespace-nowrap']")// menu sekmesi
    public WebElement menuButton;

    @FindBy(xpath = "//span[.='Bakery']")// menüdeki bakery seçeneği
    public WebElement menuBakeryButton;
    @FindBy(xpath = "//span[.='Makeup']")// menüdeki makeup seçeneği
    public WebElement menuMakeupButton;
    @FindBy(xpath = "//span[.='Bags']")// menüdeki bags seçeneği
    public WebElement menuBagsButton;
    @FindBy(xpath = "//span[.='Clothing']")// menüdeki clothing seçeneği
    public WebElement menuClothingButton;
    @FindBy(xpath = "//span[.='Furniture']")// menüdeki furniture seçeneği
    public WebElement menuFurnitureButton;
    @FindBy(xpath = "//span[.='Daily Needs']")// menüdeki daily needs seçeneği
    public WebElement menuDailyNeedsButton;
    @FindBy(xpath = "//span[.='Books']")// menüdeki books seçeneği
    public WebElement menuBooksButton;
    @FindBy(xpath = "//button[.='Join']")// login olma butonu
    public WebElement joinButton;
    @FindBy(id = "headlessui-menu-button-1")
    public WebElement shelfDropDownButon;
    @FindBy(xpath = "//ul[@role='menu']")
    public WebElement shelfDropDownMenu;
    @FindBy(xpath = "//div[@role='menuitem']")
    public List<WebElement> shelfDropDownMenuList;
    @FindBy(xpath = "//div[@role='menuitem']")
    public List<WebElement> menu;
    @FindBy(xpath = "//a[@class='flex items-center font-normal text-heading no-underline transition duration-200 hover:text-accent focus:text-accent']")
    public  List<WebElement> findButton;
    @FindBy(xpath = "//a[text()='Become a Seller']")
    public WebElement becomeASellerButton;
    @FindBy(xpath = "//button[text()='Join']")
    public WebElement join;
    @FindBy(xpath = "//img[@class='h-auto w-full']")
    public List <WebElement> frame;
    @FindBy(xpath = "//img[@class='product-image']")
    public List <WebElement> homepageurunler;
    @FindBy(xpath = "//img[@alt='Pickbazar']")
    public WebElement pickBazarButon;

    @FindBy(xpath = "//a[.='Offers']")// ana ekranda Offers Butonuna tiklar
    public WebElement OffersButon;

    @FindBy(xpath = "//a[.='FAQ']")// ana ekranda FAQ Butonuna tiklar
    public WebElement FAQButon;

    @FindBy(xpath = "//a[.='FAQ']")// Ana sayfada "Shelf" dropdown menüsüne gidilir.
    public WebElement ShelfButon;










}


