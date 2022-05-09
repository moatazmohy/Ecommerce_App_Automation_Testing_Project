package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AwesomeTagPage;
import pages.Header;
import pages.SideMenu;
import pages.TagsPage;

public class TagsStepDefinition {

    Header header;
    SideMenu sideMenu;
    AwesomeTagPage awesomeTagPage;
    TagsPage tagsPage;

    //Scenario1
    @Given("User clicks Computers category")
    public void user_clicks_computers_category() {
        header = new Header(Hooks.driver);
        header.clickComputersCategory();
    }

    @When("User scrolls down to tags section and clicks a tag")
    public void user_scrolls_down_to_tags_section_and_clicks_a_tag() {
        sideMenu = new SideMenu(Hooks.driver);
        sideMenu.clickAwesomeTag();
    }

    @Then("Chosen tag page is opened")
    public void chosen_tag_page_is_opened() {
        awesomeTagPage = new AwesomeTagPage(Hooks.driver);
        Assert.assertTrue(awesomeTagPage.awesomePageTitleIsDisplayed());
    }

    //Scenario2
    @When("User scrolls down to tags section and clicks view all")
    public void user_scrolls_down_to_tags_section_and_clicks_view_all() {
        sideMenu = new SideMenu(Hooks.driver);
        sideMenu.clickViewAll();
    }

    @When("User clicks a tag")
    public void user_clicks_a_tag() {
        tagsPage = new TagsPage(Hooks.driver);
        tagsPage.clickAwesomeTag();
    }

}
