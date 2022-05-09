package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AdidasShoes;
import pages.Header;
import pages.ShoesSubCategoryPage;
import pages.SideMenu;

public class ColorFilterStepDefinition {

    Header header;
    ShoesSubCategoryPage shoesSubCategoryPage;
    AdidasShoes adidasShoes;
    SideMenu sideMenu;

    @When("User hover over apparel category")
    public void user_hover_over_apparel_category() {
        header = new Header(Hooks.driver);
        header.hoverApparelCategory();
    }

    @And("User clicks shoes sub-Category")
    public void user_clicks_shoes_sub_category() {
        header.clickShoesSubCategory();
    }

    @And("User selects red color")
    public void user_selects_red_color() {
        sideMenu = new SideMenu(Hooks.driver);
        sideMenu.checkRedColorFilter();
    }

    @And("User clicks filtered item")
    public void user_clicks_filtered_item() {
        shoesSubCategoryPage = new ShoesSubCategoryPage(Hooks.driver);
        shoesSubCategoryPage.clickRedShoes();
    }

    @Then("Red color should be found")
    public void red_color_should_be_found() {
        adidasShoes = new AdidasShoes(Hooks.driver);
        Assert.assertTrue(adidasShoes.redColorSelectorIsDisplayed());
    }
}
