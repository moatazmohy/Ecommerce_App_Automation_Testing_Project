package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.PasswordRecoveryPage;

public class ResetPasswordStepDefinition {

    LoginPage loginPage;
    PasswordRecoveryPage passwordRecoveryPage;

    @And("User clicks forgot password button")
    public void user_clicks_forgot_password_button() {
        loginPage = new LoginPage(Hooks.driver);
        loginPage.clickForgotPasswordButton();
    }
    @When("User fills the required email field with valid email")
    public void user_fills_the_required_email_field_with_valid_email() {
        passwordRecoveryPage = new PasswordRecoveryPage(Hooks.driver);
        passwordRecoveryPage.fillEmailField("moa@test.com");
    }
    @And("User clicks recover button")
    public void user_clicks_recover_button() {
        passwordRecoveryPage.clickRecoverButton();
    }
    @Then("Instructions email message should be displayed")
    public void instructions_email_message_should_be_displayed() {
        Assert.assertEquals(passwordRecoveryPage.instructionEmailMsgTxt(), passwordRecoveryPage.getInstructionEmailMsgTxt());
    }

}
