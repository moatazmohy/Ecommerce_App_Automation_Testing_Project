package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BooksCategoryPage {
    //Variables
    private WebDriver driver;
    private JavascriptExecutor js;

    //Locators
    private By firstPrizePiesBookWishlistBtn = By.xpath("//div[@data-productid='38']//button[text()='Add to wishlist']");
    private By firstPrizePiesBookAddToCartBtn = By.xpath("//div[@data-productid='38']//button[@class='button-2 product-box-add-to-cart-button']");
    private By firstPrizePiesBookTitle = By.xpath("//div[@class='item-box']//h2[@class='product-title']/a[@href='/first-prize-pies']");

    //Constructor
    public BooksCategoryPage(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
    }

    //Actions
    public void clickFirstPrizePiesBookWishlistBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(firstPrizePiesBookWishlistBtn));
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(firstPrizePiesBookWishlistBtn));
        driver.findElement(firstPrizePiesBookWishlistBtn).click();
    }

    public void clickFirstPrizePiesBookAddToCartBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(firstPrizePiesBookAddToCartBtn));
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(firstPrizePiesBookAddToCartBtn));
        driver.findElement(firstPrizePiesBookAddToCartBtn).click();
    }

    public String getFirstPrizePiesBookTitle() {
        return driver.findElement(firstPrizePiesBookTitle).getText();
    }
}
