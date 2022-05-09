package pages;

import org.openqa.selenium.WebDriver;

public class HomePage {
    //Variables
    private WebDriver driver;
    private String url = "https://demo.nopcommerce.com/";
    //Locators

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void navigateToHomePage() {
        driver.navigate().to(url);
    }

}
