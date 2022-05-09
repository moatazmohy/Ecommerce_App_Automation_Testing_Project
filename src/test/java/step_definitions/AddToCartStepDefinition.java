package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

public class AddToCartStepDefinition {

    Header header;
    CameraSubCategoryPage cameraSubCategoryPage;
    CartPage cartPage;
    CellPhonesSubCategoryPage phonesSubCategoryPage;
    HtcBluePhonePage htcBluePhonePage;

    private String nikonCameraTitle;
    private String htcBluePhoneTitle;

    @When("User hover over electronics category")
    public void user_hover_over_electronics_category() {
        header = new Header(Hooks.driver);
        header.hoverElectronicsCategory();
    }

    @And("User clicks Camera & photo sub-Category")
    public void user_clicks_camera_photo_sub_category() {
        header.clickCameraSubCategory();
    }

    @And("User clicks add to cart of a product")
    public void user_clicks_add_to_cart_of_a_product() {
        cameraSubCategoryPage = new CameraSubCategoryPage(Hooks.driver);
        nikonCameraTitle = cameraSubCategoryPage.getNikonCameraTitle();
        cameraSubCategoryPage.clickNikonCameraAddToCart();
    }

    @And("User goes to cart")
    public void user_goes_to_cart() {
        header = new Header(Hooks.driver);
        header.clickShoppingCartBtn();
    }

    @Then("Product added successfully to the cart")
    public void product_added_successfully_to_the_cart() {
        cartPage = new CartPage(Hooks.driver);
        String expectedResult = nikonCameraTitle;
        String actualResult = cartPage.getProductAddedTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Scenario 2

    @When("User clicks Cell Phones sub-Category")
    public void user_clicks_cell_phones_sub_category() {
        header.clickCellPhonesSubCategory();
    }

    @And("User clicks a product from the shown products")
    public void user_clicks_a_product_from_the_shown_products() {
        phonesSubCategoryPage = new CellPhonesSubCategoryPage(Hooks.driver);
        phonesSubCategoryPage.clickHtcBluePhone();
    }

    @And("User clicks add to cart of the product")
    public void user_clicks_add_to_cart_of_the_product() {
        htcBluePhonePage = new HtcBluePhonePage(Hooks.driver);
        htcBluePhoneTitle = htcBluePhonePage.getHtcBluePhoneTitle();
        htcBluePhonePage.clickHtcBluePhoneAddToCart();
    }

    @Then("The Product added successfully to the cart")
    public void theProductAddedSuccessfullyToTheCart() {
        cartPage = new CartPage(Hooks.driver);
        String actualResult = cartPage.getProductAddedTitle();
        String expectedResult = htcBluePhoneTitle;
        Assert.assertEquals(actualResult, expectedResult);
    }
}
