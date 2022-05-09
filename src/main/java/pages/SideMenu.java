package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class SideMenu {
    //Variables
    private WebDriver driver;
    private JavascriptExecutor js;

    //Locators
    private By redColorFilter = By.id("attribute-option-15");
    private By awesomeTag = By.cssSelector("a[href='/awesome']");
    private By viewAllBtn = By.cssSelector("a[href='/producttag/all']");

    //Constructor
    public SideMenu(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
    }

    //Actions
    public void checkRedColorFilter() {
        driver.findElement(redColorFilter).click();
    }

    public void clickAwesomeTag() {
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(awesomeTag));
        driver.findElement(awesomeTag).click();
    }

    public void clickViewAll() {
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(viewAllBtn));
        driver.findElement(viewAllBtn).click();
    }
}
