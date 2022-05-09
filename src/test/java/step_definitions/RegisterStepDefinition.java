package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Header;
import pages.RegisterPage;

public class RegisterStepDefinition {

    Header header;
    RegisterPage registerPage;

    @Given("User navigates to register page")
    public void user_navigates_to_register_page() {
        header = new Header(Hooks.driver);
        header.clickOnRegisterButtonHP();
    }
    @When("User fills the required fields with valid data")
    public void user_fills_the_required_fields_with_valid_data() {
        registerPage = new RegisterPage(Hooks.driver);
        registerPage.fillRegisterFields("Moataz", "Mohy", "moa@test.com", "123456789");
    }
    @And("User clicks register button")
    public void user_clicks_register_button() {
        registerPage.clickRegisterButton();
    }
    @Then("User could register successfully")
    public void user_could_register_successfully() {
        Assert.assertTrue(registerPage.successfulRegisterIsDisplayed());
    }
}
