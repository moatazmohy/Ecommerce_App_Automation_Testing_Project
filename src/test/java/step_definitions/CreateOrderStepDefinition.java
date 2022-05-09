package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.BooksCategoryPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.Header;

public class CreateOrderStepDefinition {

    Header header;
    CartPage cartPage;
    BooksCategoryPage booksCategoryPage;
    CheckoutPage checkoutPage;

    private String orderPrice;

    @Given("Shopping cart is empty")
    public void shopping_cart_is_empty() {
        header = new Header(Hooks.driver);
        header.clickShoppingCartBtn();
        cartPage = new CartPage(Hooks.driver);
        cartPage.clearCart();
    }

    @When("User clicks add to cart of a book")
    public void user_clicks_add_to_cart_of_a_book() {
        booksCategoryPage = new BooksCategoryPage(Hooks.driver);
        booksCategoryPage.clickFirstPrizePiesBookAddToCartBtn();
    }


    @And("User clicks checkout button")
    public void user_clicks_checkout_button() {
        orderPrice = cartPage.getProductPrice();
        cartPage.clickTermsOfServiceBtn();
        cartPage.clickCheckoutBtn();
    }

    @And("User fills required fields of billing address")
    public void user_fills_required_fields_of_billing_address() {
        checkoutPage = new CheckoutPage(Hooks.driver);
        checkoutPage.fillRequiredBillingAddressFields("Giza", "123 salah salem st", "12345", "01000000001","Egypt");
        checkoutPage.clickContinueBillingAddressBtn();
    }

    @And("User selects shipping method and payment method")
    public void user_selects_shipping_method_and_payment_method() {
        checkoutPage.clickGroundShippingBtn();
        checkoutPage.clickContinueShippingMethodBtn();
        checkoutPage.clickChequePaymentMethodBtn();
        checkoutPage.clickContinuePaymentMethodBtn();
        checkoutPage.clickContinuePaymentInfoBtn();
    }

    @And("User confirms the order")
    public void user_confirms_the_order() {
        String checkoutPrice = checkoutPage.getProductPrice();
        Assert.assertEquals(checkoutPrice, orderPrice);
        checkoutPage.clickConfirmOrderBtn();
    }

    @Then("Successful message appears")
    public void successful_message_appears() {
        String expectedResult = "Your order has been successfully processed!";
        String actualResult = checkoutPage.getSuccessfulOrderMsg();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
