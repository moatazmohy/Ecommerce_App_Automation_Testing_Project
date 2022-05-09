package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CameraSubCategoryPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By nikonCameraAddToCartBtn = By.xpath("//div[@data-productid=\"13\"]//button[text()='Add to cart']");
    private By nikonCameraTitle = By.xpath("//div[@class='item-box']//h2[@class='product-title']/a[@href='/nikon-d5500-dslr']");
    //Constructor
    public CameraSubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickNikonCameraAddToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(nikonCameraAddToCartBtn));
        driver.findElement(nikonCameraAddToCartBtn).click();
    }

    public String getNikonCameraTitle() {
        return driver.findElement(nikonCameraTitle).getText();
    }
}
