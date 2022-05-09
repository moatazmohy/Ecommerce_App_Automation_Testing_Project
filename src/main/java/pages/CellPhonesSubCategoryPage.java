package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CellPhonesSubCategoryPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By htcBluePhone = By.xpath("//h2[@class='product-title']/a[@href='/htc-one-mini-blue']");

    //Constructor
    public CellPhonesSubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickHtcBluePhone() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(driver.findElement(htcBluePhone)));
        driver.findElement(htcBluePhone).click();
    }

}
