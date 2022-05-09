package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CompareProductsPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By nameRowCompare = By.xpath("//label[text()='Name']");
    private By firstProduct = RelativeLocator.with(By.tagName("a")).toRightOf(nameRowCompare);
    private By secondProduct = RelativeLocator.with(By.tagName("a")).toRightOf(nameRowCompare).toRightOf(firstProduct);


    //Constructor
    public CompareProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public String getFirstProductAddedTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(nameRowCompare));
        return driver.findElement(firstProduct).getText();
    }

    public String getSecondProductAddedTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(nameRowCompare));
        return driver.findElement(secondProduct).getText();
    }
}
