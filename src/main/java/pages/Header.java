package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Header {
    //Variables
    private WebDriver driver;

    //Locators
    private By registerButton = By.cssSelector("a[class='ico-register']");
    private By loginButton = By.cssSelector("a[class='ico-login']");
    private By searchField = By.id("small-searchterms");
    private By searchResultLenovo = By.xpath("//li[@class='ui-menu-item'][2]");
    private By currencySelector = By.id("customerCurrency");
    private By euroCurrency = By.xpath("//option[text()='Euro']");
    private By productPriceCurrency = By.xpath("//div[@class='prices']");
    private By computersCategory = By.xpath("//ul[@class='top-menu notmobile']/li/a[@href='/computers']");
    private By desktopsSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/desktops']");
    private By notebooksSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/notebooks']");
    private By apparelCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']");
    private By shoesSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/shoes']");
    private By electronicsCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']");
    private By cameraSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/camera-photo']");
    private By booksCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']");
    private By cellPhonesSubCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/cell-phones']");
    private By jewelryCategory = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']");
    private By shoppingCartBtn = By.cssSelector("span[class='cart-label']");
    private By notificationSuccessMsg = By.cssSelector("div[class='bar-notification success']");
    private By wishlistBtn = By.cssSelector("span[class='wishlist-label']");
    private By compareProductsBtn = By.xpath("//p/a[@href='/compareproducts']");

    //Constructor
    public Header(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickOnRegisterButtonHP() {
        driver.findElement(registerButton).click();
    }

    public void clickOnLoginButtonHP() {
        driver.findElement(loginButton).click();
    }

    public void clickSearchField() {
        driver.findElement(searchField).click();
    }

    public void fillSearchField(String search) {
        driver.findElement(searchField).sendKeys(search);
    }

    public void clickSearchResult() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(searchResultLenovo));
        driver.findElement(searchResultLenovo).click();
    }

    public void clickCurrencySelector() {
        driver.findElement(currencySelector).click();
    }

    public void clickEuroCurrency() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(euroCurrency));
        driver.findElement(euroCurrency).click();
    }

    public String getProductPriceCurrency() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(productPriceCurrency));
        return driver.findElement(productPriceCurrency).getText().toLowerCase();
    }

    public void hoverComputersCategory() {
        new Actions(driver).moveToElement(driver.findElement(computersCategory)).perform();
    }

    public void clickDesktopsSubCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(desktopsSubCategory));
        new Actions(driver).moveToElement(driver.findElement(desktopsSubCategory)).click().perform();
    }

    public void hoverApparelCategory() {
        new Actions(driver).moveToElement(driver.findElement(apparelCategory)).perform();
    }

    public void clickShoesSubCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(shoesSubCategory));
        new Actions(driver).moveToElement(driver.findElement(shoesSubCategory)).click().perform();
    }

    public void clickComputersCategory() {
        driver.findElement(computersCategory).click();
    }

    public void hoverElectronicsCategory() {
        new Actions(driver).moveToElement(driver.findElement(electronicsCategory)).perform();
    }

    public void clickCameraSubCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(cameraSubCategory));
        new Actions(driver).moveToElement(driver.findElement(cameraSubCategory)).click().perform();
    }

    public void clickShoppingCartBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.invisibilityOfElementLocated(notificationSuccessMsg));
        new Actions(driver).moveToElement(driver.findElement(shoppingCartBtn)).click().perform();
    }

    public void clickCellPhonesSubCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(cellPhonesSubCategory));
        new Actions(driver).moveToElement(driver.findElement(cellPhonesSubCategory)).click().perform();
    }

    public void clickBooksCategory() {
        driver.findElement(booksCategory).click();
    }

    public void clickWishlistBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.invisibilityOfElementLocated(notificationSuccessMsg));
        new Actions(driver).moveToElement(driver.findElement(wishlistBtn)).click().perform();
    }

    public void clickJewelryCategory() {
        driver.findElement(jewelryCategory).click();
    }

    public void clickNotebooksSubCategory() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(notebooksSubCategory));
        new Actions(driver).moveToElement(driver.findElement(notebooksSubCategory)).click().perform();
    }

    public void clickCompareProductsBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(notificationSuccessMsg));
        new Actions(driver).moveToElement(driver.findElement(compareProductsBtn)).click().perform();
    }
}
