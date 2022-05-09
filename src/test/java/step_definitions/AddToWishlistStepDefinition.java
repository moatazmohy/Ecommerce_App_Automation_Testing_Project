package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.*;

public class AddToWishlistStepDefinition {

    Header header;
    BooksCategoryPage booksCategoryPage;
    WishlistPage wishlistPage;
    JewelryCategoryPage jewelryCategoryPage;
    FlowerGirlBraceletPage flowerGirlBraceletPage;

    private String firstPrizePiesBookTitle;
    private String flowerGirlBraceletTitle;

    @Given("Wishlist is empty")
    public void wishlist_is_empty() {
        header = new Header(Hooks.driver);
        header.clickWishlistBtn();
        wishlistPage = new WishlistPage(Hooks.driver);
        wishlistPage.clearWishlist();
    }

    @When("User clicks Books category")
    public void user_clicks_books_category() {
        header = new Header(Hooks.driver);
        header.clickBooksCategory();
    }

    @And("User clicks Wishlist button of a product")
    public void user_clicks_wishlist_button_of_a_product() {
        booksCategoryPage = new BooksCategoryPage(Hooks.driver);
        firstPrizePiesBookTitle = booksCategoryPage.getFirstPrizePiesBookTitle();
        booksCategoryPage.clickFirstPrizePiesBookWishlistBtn();
    }

    @And("User goes to Wishlist")
    public void user_goes_to_wishlist() {
        header.clickWishlistBtn();
    }

    @Then("Product added successfully to the Wishlist")
    public void product_added_successfully_to_the_wishlist() {
        wishlistPage = new WishlistPage(Hooks.driver);
        String expectedResult = firstPrizePiesBookTitle;
        String actualResult = wishlistPage.getProductAddedTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Scenario 2

    @And("User clicks jewelry category")
    public void User_clicks_jewelry_category() {
        header = new Header(Hooks.driver);
        header.clickJewelryCategory();
    }

    @And("User clicks a jewelry from the shown products")
    public void User_clicks_a_jewelry_from_the_shown_products() {
        jewelryCategoryPage = new JewelryCategoryPage(Hooks.driver);
        flowerGirlBraceletTitle = jewelryCategoryPage.getFlowerGirlBraceletTitle();
        jewelryCategoryPage.clickFlowerGirlBracelet();
    }

    @And("User clicks add to Wishlist of the product")
    public void user_clicks_add_to_wishlist_of_the_product() {
        flowerGirlBraceletPage = new FlowerGirlBraceletPage(Hooks.driver);
        flowerGirlBraceletPage.clickFlowerGirlBraceletWishlistBtn();
    }

    @Then("The Product added successfully to the Wishlist")
    public void the_product_added_successfully_to_the_wishlist() {
        wishlistPage = new WishlistPage(Hooks.driver);
        String expectedResult = flowerGirlBraceletTitle;
        String actualResult = wishlistPage.getProductAddedTitle();
        Assert.assertEquals(actualResult, expectedResult);
    }


}
