package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeTagPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By awesomeTitle = By.cssSelector("div[class='page-title']");

    //Constructor
    public AwesomeTagPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public boolean awesomePageTitleIsDisplayed() {
        return driver.findElement(awesomeTitle).getText().contains("awesome");
    }
}
