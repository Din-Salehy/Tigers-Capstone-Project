package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {

	HomePageObject homePageobj = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePageobj.clickOnCurrency();
		logger.info("User clicked on currency successfuly");
		Utils.hardWait();
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePageobj.selectEuroCurrency();
		logger.info("User selected Euro currency successfully");
		Utils.hardWait();
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		Assert.assertTrue(homePageobj.currencyValueChange());
		logger.info("Currency change to Euro Varified successfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}
//	Scenario: User empty Shopping cart message displays 

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homePageobj.clickOnShoppingCart();
		logger.info("User clicked on shopping cart successfully");
		Utils.hardWait();
	}

	@Then("Your shopping cart is empty! message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		Assert.assertTrue(homePageobj.shopingCartEmptyText());
		logger.info("Your shoping is empty message varified successfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}
}
