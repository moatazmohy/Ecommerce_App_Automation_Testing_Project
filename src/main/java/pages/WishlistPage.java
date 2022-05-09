package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WishlistPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By productTitle = By.cssSelector("a[class='product-name']");
    private By emptyWishlistMsg = By.cssSelector("div[class='no-data']");
    private By removeProduct = By.cssSelector("button[class='remove-btn']");

    //Constructor
    public WishlistPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clearWishlist() {
        while (driver.findElements(emptyWishlistMsg).isEmpty()) {
            driver.findElement(removeProduct).click();
        }
    }

    public String getProductAddedTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(productTitle));
        return driver.findElement(productTitle).getText();
    }
}
