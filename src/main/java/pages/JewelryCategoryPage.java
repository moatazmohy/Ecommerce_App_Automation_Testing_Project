package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JewelryCategoryPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By flowerGirlBraceletTitle = By.xpath("//div[@class='item-box']//h2[@class='product-title']/a[@href='/flower-girl-bracelet']");

    //Constructor
    public JewelryCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickFlowerGirlBracelet() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(flowerGirlBraceletTitle));
        driver.findElement(flowerGirlBraceletTitle).click();
    }

    public String getFlowerGirlBraceletTitle() {
        return driver.findElement(flowerGirlBraceletTitle).getText();
    }
}
