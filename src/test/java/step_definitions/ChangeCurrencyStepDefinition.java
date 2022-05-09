package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Header;

public class ChangeCurrencyStepDefinition {

    Header header;

    @When("User clicks currency button")
    public void user_clicks_currency_button() {
        header = new Header(Hooks.driver);
        header.clickCurrencySelector();
    }
    @And("User clicks euro button")
    public void user_clicks_euro_button() {
        header.clickEuroCurrency();
    }
    @Then("Currency changes to euro")
    public void currency_changes_to_euro() {
        System.out.println(header.getProductPriceCurrency());
        Assert.assertTrue(header.getProductPriceCurrency().contains("€"));
    }

}
