package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.Header;
import pages.ProductPage;

public class SearchStepDefinition {

    Header header;
    ProductPage productPage;
    String searchWord = "lenovo";

    @When("User clicks search field")
    public void user_clicks_search_field() {
        header = new Header(Hooks.driver);
        header.clickSearchField();
    }

    @And("User fills the search field")
    public void user_fills_the_search_field() {
        header.fillSearchField(searchWord);
    }

    @And("User clicks search result from the result menu")
    public void user_clicks_search_result_from_the_result_menu() {
        header.clickSearchResult();
    }

    @Then("Search result should be displayed as the user's search")
    public void search_result_should_be_displayed_as_the_user_s_search() {
        productPage = new ProductPage(Hooks.driver);
        Assert.assertTrue(productPage.getProductName().contains(searchWord));
    }

}
