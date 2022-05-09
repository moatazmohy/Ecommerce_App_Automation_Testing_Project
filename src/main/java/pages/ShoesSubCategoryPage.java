package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoesSubCategoryPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By redShoes = By.xpath("//h2[@class='product-title']/a[@href='/adidas-consortium-campus-80s-running-shoes']");

    //Constructor
    public ShoesSubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickRedShoes() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.stalenessOf(driver.findElement(redShoes)));
        driver.findElement(redShoes).click();
    }


}
