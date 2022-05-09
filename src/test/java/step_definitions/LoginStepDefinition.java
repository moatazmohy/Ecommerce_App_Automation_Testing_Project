package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Header;
import pages.LoginPage;


public class LoginStepDefinition {

    Header header;
    LoginPage loginPage;

    @Given("User navigates to login page")
    public void user_navigates_to_login_page() {
        header = new Header(Hooks.driver);
        header.clickOnLoginButtonHP();
    }

    @When("User fills the required fields with valid email and password")
    public void user_fills_the_required_fields_with_valid_email_and_password() {
        loginPage = new LoginPage(Hooks.driver);
        loginPage.fillLoginFields("moa@test.com", "123456789");
    }

    @And("User clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("User could login successfully")
    public void user_could_login_successfully() {
        Assert.assertTrue(loginPage.myAccountButtonIsDisplayed());
    }
}
