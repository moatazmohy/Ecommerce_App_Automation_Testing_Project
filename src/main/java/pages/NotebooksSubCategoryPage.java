package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NotebooksSubCategoryPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By asusLaptopAddToCompareListBtn = By.xpath("//div[@data-productid=\"5\"]//button[text()='Add to compare list']");
    private By asusLaptopTitle = By.xpath("//div[@class='item-box']//h2[@class='product-title']/a[@href='/asus-n551jk-xo076h-laptop']");
    private By hpLaptopTitle = By.xpath("//div[@class='item-box']//h2[@class='product-title']/a[@href='/hp-envy-6-1180ca-156-inch-sleekbook']");

    //Constructor
    public NotebooksSubCategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickAsusLaptopAddToCompareListBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(asusLaptopAddToCompareListBtn));
        driver.findElement(asusLaptopAddToCompareListBtn).click();
    }

    public String getAsusLaptopTitle() {
        return driver.findElement(asusLaptopTitle).getText();
    }

    public void clickHpLaptop() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(hpLaptopTitle));
        driver.findElement(hpLaptopTitle).click();
    }

    public String getHpLaptopTitle() {
        return driver.findElement(hpLaptopTitle).getText();
    }

}
