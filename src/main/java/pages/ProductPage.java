package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    //Variables
    private WebDriver driver;

    //Locators
    By productName = By.cssSelector("div[class='product-name']");

    //Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public String getProductName() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(productName));
        return driver.findElement(productName).getText().toLowerCase();
    }
}
