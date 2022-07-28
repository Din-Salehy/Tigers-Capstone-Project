package step.definitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {

	RetailPageObject obj = new RetailPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		obj.getRetailWebsiteText();
		logger.info("Retail website page varified succesfully");
		Utils.hardWait();
	}

	@Given("User click  on My Account")
	public void user_click_on_my_account() {
		obj.clickOnMyAcctLink();
		logger.info("My Account link clicked successfully");
		Utils.hardWait();
	}

	@When("User click on Login")
	public void user_click_on_login() {
		obj.clickOnLoginLink();
		logger.info("Login link clicked successfully");
		Utils.hardWait();
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String userName, String paswrod) {
		obj.enterEmailAddress("tiger1212@gmail.com");
		obj.enterPassword("tiger1212");
		logger.info("username and password enetered successfully");
		Utils.hardWait();
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		obj.clickOnLoginButton();
		logger.info("login button clicked successfully");
		Utils.hardWait();
	}

	@Then("User should be logged in to My Account dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		obj.getTextFromAcctDashboard();
		logger.info("User logged into dashboard succesfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();

	}

//	 Scenario: Register as an Affiliate user with Cheque Payment Method
	
	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_Register_for_an_Affiliate_Account_link() {
		obj.clickOnRegisterAffilaiteAcctLink();
		logger.info("Register as an Affilaite link clicked succesfully");
		Utils.hardWait();
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		obj.enterCompanyName(data.get(0).get("company"));
		obj.enterWebsite(data.get(0).get("website"));
		obj.entertaxID(data.get(0).get("taxID"));
		obj.selectCheckPaymentMethod(data.get(0).get("paymentMethod"));
		logger.info("Affilaite form filled succesffully");
		Utils.hardWait();
	}

	@When("User enter cheque payee name")
	public void User_enter_cheque_payee_name() {
		obj.enterChequePayeeName("TekSchool");
		logger.info("Check payee name entered successfully");
		Utils.hardWait();
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		obj.clickOnAboutUsCheckBox();
		logger.info("About Us Check box clicked succesfully");
		Utils.hardWait();

	}

	@When("User click on Continue button")
	public void user_click_on_Continue_button() {
		obj.clickOnContinueButton();
		logger.info("Continue button clicked sucessfully");
		Utils.hardWait();
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String actualMessage = obj.affiliateRegSuccessMessage();
		String expetctedMsg = "Success: Your account has been successfully updated.";
		Assert.assertEquals(expetctedMsg, actualMessage);
		logger.info("Affiliate registeration success message varified successfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}

//	 Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer	

	@When("User click on Edit your affiliate information link")
	public void User_click_on_Edit_your_affiliate_information_link() {
		obj.clickOnEditYourAffiliateInformation();
		logger.info("Edit affiliate link clicked succesffuly");
		Utils.hardWait();
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		obj.clickOnBankTransferRadioButton();
		logger.info("Bank transfer radio btn clicked succesfully");
		Utils.hardWait();
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		obj.editBankName(data.get(0).get("bankName"));
		obj.editBranchNumber(data.get(0).get("abaNumber"));
		obj.editSwitftCode(data.get(0).get("swiftCode"));
		obj.editAccountName(data.get(0).get("accountName"));
		obj.editAccountNumber(data.get(0).get("accountNumber"));
		logger.info("Bank information filled successfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}
//	Scenario: Edit your account Information

	@When("User click on Edit your account information link")
	public void User_click_on_Edit_your_account_information_link() {
		obj.clickOnEditYourAccountInformation();
		logger.info("Edit your account information link clicked successfuly");
		Utils.hardWait();
	
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		obj.editFirstName(data.get(0).get("firstname"));
		obj.editLastName(data.get(0).get("lastName"));
		obj.editEmail(data.get(0).get("email"));
		obj.editTelephone(data.get(0).get("telephone"));
		logger.info("User modified account information successfully");
		Utils.hardWait();
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() {
		obj.clickOnEditContinteButton();
		logger.info("Eidt continue button clicked usccesfully");
		Utils.hardWait();
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		String actualMessage = obj.getEditSuccessMessage();
		String expetcedMessage = "Success: Your account has been successfully updated.";
		Assert.assertEquals(expetcedMessage, actualMessage);
		logger.info("Edit success message varified succesfully");
		Utils.hardWait();
		Utils.takeScreenshotForStep();
	}

}
