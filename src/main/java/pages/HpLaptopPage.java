package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HpLaptopPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By hpLaptopAddToCompareListBtn = By.xpath("//div[@class='overview-buttons']//button[text()='Add to compare list']");

    //Constructor
    public HpLaptopPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickHpLaptopAddToCompareListBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(hpLaptopAddToCompareListBtn));
        driver.findElement(hpLaptopAddToCompareListBtn).click();
    }
}
