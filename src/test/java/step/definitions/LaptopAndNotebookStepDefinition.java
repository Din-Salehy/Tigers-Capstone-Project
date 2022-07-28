package step.definitions;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.objects.LaptopAndNotebookPageObject;
import utilities.Utils;

public class LaptopAndNotebookStepDefinition extends Base{

	LaptopAndNotebookPageObject laptoAndNottePageobj = new LaptopAndNotebookPageObject();

	//Background
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		laptoAndNottePageobj.clickOnLaptopAndNotebookTab();
		logger.info("Laptop and Notebook link clicked successfully");
	}
	
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		laptoAndNottePageobj.clickOnShowAllLaptopAndNotebookLink();
		logger.info("Show all Laptop and Notebook option clicked successfully");
		Utils.hardWait();

	}
	
//	Scenario: Add and Remove a Mac book from Cart
	
	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		laptoAndNottePageobj.clickOnMacBookLink();
		logger.info("User clicked on Mac book link clicked successfully");
	}
	
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) {
		laptoAndNottePageobj.varifyCartItems();
		logger.info("item 602 showed successfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}
	
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		laptoAndNottePageobj.clickOnCartOption();
		logger.info("User clicked on Cart option clicked successfully");
		Utils.hardWait();
	}
	
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptoAndNottePageobj.clickOnXButton();
		logger.info("User clicked on Red X button link clicked successfully");
		Utils.hardWait();
	}
	
	@Then("item should be removed and cart should show {int} items")
	public void item_should_be_removed_and_cart_should_show_items(Integer int1) {
		laptoAndNottePageobj.confirmNoItemInTheCart();
		logger.info("Zeero item in the cart confirmed successfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}

//	 Scenario: Product Comparison
	
	
	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() {
		laptoAndNottePageobj.clickOnMakBookProductComparison();
		Utils.hardWait();
		logger.info("User clicked on product comparison icond on MacBook Succesfully");
	}
	
	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {
		laptoAndNottePageobj.clickOnMacBookAirProdcutComparison();
		logger.info("User clicked product comparison icon on MacBook Air Successfully"); 
	}
	
	@When("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		laptoAndNottePageobj.clickOnProdcutComparisonLink();
		logger.info("User clicked on Product comparison link Successfully");
	}
	
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		laptoAndNottePageobj.productComparisonChart();
		logger.info("Product comparison chart varified successfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}
	
//	 Scenario: Adding an item to Wish list
	
	@When("User click on heart icon to add Sony VaIO laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		laptoAndNottePageobj.clickOnHeartIcon();
		logger.info("User clicked on Heart icon to addSony VaIO laptop added to wish list");
	}
	@Then("User should get a Message {string}")
	public void user_should_get_a_message(String string) {
		laptoAndNottePageobj.isMessagePresent();
		logger.info("You must login or create an account to save Sony VAIO to your message varified");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}
	
//	 Scenario: Validate the price of MacBook Pro is 2000
	
	@When("User click on MacBook Pro item")
	public void user_click_on_mac_book_pro_item() {
		laptoAndNottePageobj.clickOnMacBookPro();
		logger.info("User clicked on makBook pro successfully");
	}
	
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		String actualPriceTag = laptoAndNottePageobj.getPriceTag();
		String expectedPriceTag = "$2,000.00";
		Assert.assertEquals(expectedPriceTag, actualPriceTag);
		logger.info("Price tag presence varified succesfully");
		Utils.takeScreenshotForStep();
	}
}
