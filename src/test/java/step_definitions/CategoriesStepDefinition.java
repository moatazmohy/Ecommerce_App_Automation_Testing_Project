package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DesktopSubCategoryPage;
import pages.Header;

public class CategoriesStepDefinition {

    Header header;
    DesktopSubCategoryPage desktopPage;

    @When("User hover over Computers category")
    public void user_hover_over_Computers_category() {
        header = new Header(Hooks.driver);
        header.hoverComputersCategory();
    }
    @And("User clicks Desktops sub-Category")
    public void user_clicks_Desktop_sub_category() {
        header.clickDesktopsSubCategory();
    }

    @Then("Category result is displaying")
    public void category_result_is_displaying() {
        desktopPage = new DesktopSubCategoryPage(Hooks.driver);
        Assert.assertTrue(desktopPage.desktopsTitleIsDisplayed());
    }
}
