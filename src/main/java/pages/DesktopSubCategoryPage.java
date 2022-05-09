package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DesktopSubCategoryPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By desktopsTitle = By.xpath("//h1[text()='Desktops']");

    //Constructor
    public DesktopSubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public boolean desktopsTitleIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(desktopsTitle));
        return driver.findElement(desktopsTitle).isDisplayed();
    }
}
