package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class RegisterPage {

    //Variables
    private WebDriver driver;

    //Locators
    private By firstNameE = By.id("FirstName");
    private By lastNameE = By.id("LastName");
    private By emailE = By.id("Email");
    private By passwordE = By.id("Password");
    private By confirmPasswordE = By.id("ConfirmPassword");
    private By registerButton = By.id("register-button");
    private By successfulRegisterMSG = By.cssSelector("div[class='result']");

    //Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void fillRegisterFields(String firstName, String lastName, String email, String password) {
        driver.findElement(firstNameE).sendKeys(firstName);
        driver.findElement(lastNameE).sendKeys(lastName);
        driver.findElement(emailE).sendKeys(email);
        driver.findElement(passwordE).sendKeys(password);
        driver.findElement(confirmPasswordE).sendKeys(password);
    }

    public void clickRegisterButton() {
        driver.findElement(registerButton).submit();
    }

    public boolean successfulRegisterIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(successfulRegisterMSG));
        return driver.findElement(successfulRegisterMSG).isDisplayed();
    }
}
