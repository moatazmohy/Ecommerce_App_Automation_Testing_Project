package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HtcBluePhonePage {
    //Variables
    private WebDriver driver;

    //Locators
    private By htcBluePhoneAddToCart = By.id("add-to-cart-button-19");
    private By htcBluePhoneTitle = By.cssSelector("div[class='product-name']");
    //Constructor
    public HtcBluePhonePage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickHtcBluePhoneAddToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(htcBluePhoneAddToCart));
        driver.findElement(htcBluePhoneAddToCart).click();
    }

    public String getHtcBluePhoneTitle() {
        return driver.findElement(htcBluePhoneTitle).getText();
    }
}
