package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FlowerGirlBraceletPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By flowerGirlBraceletWishlistBtn = By.id("add-to-wishlist-button-41");

    //Constructor
    public FlowerGirlBraceletPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickFlowerGirlBraceletWishlistBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(flowerGirlBraceletWishlistBtn));
        driver.findElement(flowerGirlBraceletWishlistBtn).click();
    }
}
