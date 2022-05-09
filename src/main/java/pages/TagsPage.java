package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagsPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By awesomeTag = By.xpath("//div[@class='page-body']//a[@href='/awesome']");

    //Constructor
    public TagsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void clickAwesomeTag() {
        driver.findElement(awesomeTag).click();
    }

}
