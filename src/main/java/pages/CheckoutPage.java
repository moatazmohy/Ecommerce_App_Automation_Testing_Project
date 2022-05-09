package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    //Variables
    private WebDriver driver;

    //Locators
    private By countryList = By.id("BillingNewAddress_CountryId");
    private By egyptCountry = By.cssSelector("option[value='123']");
    private By cityField = By.id("BillingNewAddress_City");
    private By address1Field = By.id("BillingNewAddress_Address1");
    private By postalCodeField = By.id("BillingNewAddress_ZipPostalCode");
    private By phoneNumberField = By.id("BillingNewAddress_PhoneNumber");
    private By groundShippingBtn = By.id("shippingoption_0");
    private By chequePaymentMethodBtn = By.id("paymentmethod_0");
    private By continueBillingAddressBtn = By.cssSelector("button[onclick='Billing.save()']");
    private By continueShippingMethodBtn = By.cssSelector("button[onclick='ShippingMethod.save()']");
    private By continuePaymentMethodBtn = By.cssSelector("button[onclick='PaymentMethod.save()']");
    private By continuePaymentInfoBtn = By.cssSelector("button[onclick='PaymentInfo.save()']");
    private By confirmOrderBtn = By.cssSelector("button[onclick='ConfirmOrder.save()']");
    private By orderPrice = By.cssSelector("span[class='product-subtotal']");
    private By successfulOrderMsg = By.cssSelector("div[class='section order-completed']");

    //Constructor
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Actions
    public void fillRequiredBillingAddressFields(String city, String address1, String postalCode, String phoneNUmber, String country) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(cityField));
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(address1Field).sendKeys(address1);
        driver.findElement(postalCodeField).sendKeys(postalCode);
        driver.findElement(phoneNumberField).sendKeys(phoneNUmber);

        Select selectCountry = new Select(driver.findElement(countryList));

        switch (country) {
            case "Egypt" :
                selectCountry.selectByVisibleText(country);
        }
    }

    public void clickContinueBillingAddressBtn() {
        driver.findElement(continueBillingAddressBtn).click();
    }

    public void clickGroundShippingBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(groundShippingBtn));
        driver.findElement(groundShippingBtn).click();
    }

    public void clickContinueShippingMethodBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(continueShippingMethodBtn));
        driver.findElement(continueShippingMethodBtn).click();
    }

    public void clickChequePaymentMethodBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(chequePaymentMethodBtn));
        driver.findElement(chequePaymentMethodBtn).click();
    }

    public void clickContinuePaymentMethodBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(continuePaymentMethodBtn));
        driver.findElement(continuePaymentMethodBtn).click();
    }

    public void clickContinuePaymentInfoBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(continuePaymentInfoBtn));
        driver.findElement(continuePaymentInfoBtn).click();
    }

    public void clickConfirmOrderBtn() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(confirmOrderBtn));
        driver.findElement(confirmOrderBtn).click();
    }

    public String getProductPrice() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(orderPrice));
        return driver.findElement(orderPrice).getText();
    }

    public String getSuccessfulOrderMsg() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(successfulOrderMsg));
        System.out.println(driver.findElement(successfulOrderMsg).getText());
        return driver.findElement(successfulOrderMsg).getText();
    }
}
