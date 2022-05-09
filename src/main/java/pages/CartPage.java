package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    //Variables
    private WebDriver driver;
    JavascriptExecutor js;

    //Locators
    private By productTitle = By.cssSelector("a[class='product-name']");
    private By productPrice = By.cssSelector("span[class='product-subtotal']");
    private By emptyCartMsg = By.cssSelector("div[class='no-data']");
    private By termsOfServiceBtn = By.id("termsofservice");
    private By checkoutBtn = By.id("checkout");
    private By removeProduct = By.cssSelector("button[class='remove-btn']");

    //Constructor
    public CartPage(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
    }

    //Actions
    public String getProductAddedTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        return driver.findElement(productTitle).getText();
    }

    public String getProductPrice() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(productPrice));
        return driver.findElement(productPrice).getText();
    }

    public void clearCart() {
        while(driver.findElements(emptyCartMsg).isEmpty()) {
            driver.findElement(removeProduct).click();
        }
    }
    public void clickTermsOfServiceBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(termsOfServiceBtn));
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(termsOfServiceBtn));
        driver.findElement(termsOfServiceBtn).click();
    }

    public void clickCheckoutBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(checkoutBtn));
        driver.findElement(checkoutBtn).click();
    }

}
