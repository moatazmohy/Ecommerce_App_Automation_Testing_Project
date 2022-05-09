package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdidasShoes {
    //Variables
    private WebDriver driver;

    //Locators
    private By redColorSelector = By.cssSelector("span[style='background-color:#663030']");

    //Constructor
    public AdidasShoes(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public boolean redColorSelectorIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(redColorSelector));
        return driver.findElement(redColorSelector).isDisplayed();
    }
}
