package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CompareProductsPage;
import pages.Header;
import pages.HpLaptopPage;
import pages.NotebooksSubCategoryPage;

public class AddToCompareListStepDefinition {

    private Header header;
    private NotebooksSubCategoryPage notebooksSubCategoryPage;
    private CompareProductsPage compareProductsPage;
    private HpLaptopPage hpLaptopPage;

    private String asusLaptopTitle;
    private String hpLaptopTitle;

    @When("User clicks Notebooks sub-Category")
    public void user_clicks_notebooks_sub_category() {
        header= new Header(Hooks.driver);
        header.clickNotebooksSubCategory();
    }

    @And("User clicks compare button of the first product")
    public void user_clicks_compare_button_of_the_first_product() {
        notebooksSubCategoryPage = new NotebooksSubCategoryPage(Hooks.driver);
        asusLaptopTitle = notebooksSubCategoryPage.getAsusLaptopTitle();
        notebooksSubCategoryPage.clickAsusLaptopAddToCompareListBtn();
    }

    @And("User clicks the second product")
    public void user_clicks_the_second_product() {
        hpLaptopTitle = notebooksSubCategoryPage.getHpLaptopTitle();
        notebooksSubCategoryPage.clickHpLaptop();
    }

    @And("User clicks add to compare list of the second product")
    public void user_clicks_add_to_compare_list_of_the_second_product() {
        hpLaptopPage = new HpLaptopPage(Hooks.driver);
        hpLaptopPage.clickHpLaptopAddToCompareListBtn();
    }

    @And("User goes to compare products page")
    public void user_goes_to_compare_products_page() {
        header.clickCompareProductsBtn();
    }

    @Then("The selected products are displayed")
    public void the_selected_products_are_displayed() {
        compareProductsPage = new CompareProductsPage(Hooks.driver);
        String firstProductActualResult = compareProductsPage.getFirstProductAddedTitle();
        String secondProductActualResult = compareProductsPage.getSecondProductAddedTitle();
        String firstProductExpectedResult = hpLaptopTitle;
        String secondProductExpectedResult = asusLaptopTitle;

        Assert.assertEquals(firstProductActualResult, firstProductExpectedResult);
        Assert.assertEquals(secondProductActualResult, secondProductExpectedResult);
    }

}
