package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PasswordRecoveryPage {

    //Variables
    private WebDriver driver;
    private String instructionEmailMsgTxt = "Email with instructions has been sent to you.";

    //Locators
    private By emailField = By.id("Email");
    private By recoverBtn = By.name("send-email");
    private By instructionEmailMsg = By.cssSelector("*[class='content']");

    //Constructor
    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public String getInstructionEmailMsgTxt() {
        return instructionEmailMsgTxt;
    }

    public void fillEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickRecoverButton() {
        driver.findElement(recoverBtn).click();
    }

    public String instructionEmailMsgTxt() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(instructionEmailMsg));
        return driver.findElement(instructionEmailMsg).getText();
    }
}
