package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By emailLoginE = By.id("Email");
    private By passwordLoginE = By.id("Password");
    private By loginBtn = By.cssSelector("button[class='button-1 login-button']");
    private By myAccountBtn = By.cssSelector("a[class='ico-account']");
    private By forgotPasswordBtn = By.cssSelector("span[class='forgot-password']");

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void fillLoginFields(String email, String password) {
        driver.findElement(emailLoginE).sendKeys(email);
        driver.findElement(passwordLoginE).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginBtn).submit();
    }

    public boolean myAccountButtonIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(myAccountBtn));
        return driver.findElement(myAccountBtn).isDisplayed();
    }

    public void clickForgotPasswordButton() {
        driver.findElement(forgotPasswordBtn).click();
    }
}
