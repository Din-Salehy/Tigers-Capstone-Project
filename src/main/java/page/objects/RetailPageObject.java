package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base{

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement retailWebsiteText;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountBtn;

	@FindBy(xpath = "//ul//a[text()='Login']")
	private WebElement loginLink;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement userNameField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//div//h2[text()='My Account']")
	private WebElement myAccountPage;

	public void getRetailWebsiteText() {
		 retailWebsiteText.isDisplayed();
	}

	public void clickOnMyAcctLink() {
		myAccountBtn.click();
	}

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public void enterEmailAddress(String userName) {
		userNameField.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String getTextFromAcctDashboard() {
		String myAccText = myAccountPage.getText();
		return myAccText;

	}

//	 Scenario: Register as an Affiliate user with Cheque Payment Method

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement affilaiteAcctLink;

	@FindBy(id = "input-company")
	private WebElement copmanyFieldLink;

	@FindBy(id = "input-website")
	private WebElement websiteFieildLink;

	@FindBy(id = "input-tax")
	private WebElement taxIDFieldLink;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequeRadioButton;

	@FindBy(id = "input-cheque")
	private WebElement chequPayeeName;

	@FindBy(xpath = "//input[@value='1']")
	private WebElement aboutUsChekBoxButton;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	public WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement registrationSuccessMessage;

	public void clickOnRegisterAffilaiteAcctLink() {
		affilaiteAcctLink.click();
	}

	public void enterCompanyName(String company) {
		copmanyFieldLink.clear();
		copmanyFieldLink.sendKeys(company);

	}

	public void enterWebsite(String website) {
		websiteFieildLink.clear();
		websiteFieildLink.sendKeys(website);

	}

	public void entertaxID(String taxID) {
		taxIDFieldLink.clear();
		taxIDFieldLink.sendKeys(taxID);

	}

	public void selectCheckPaymentMethod(String paymentMethod) {
		chequeRadioButton.click();
	}

	public void enterChequePayeeName(String payeeName) {
		chequPayeeName.clear();
		chequPayeeName.sendKeys(payeeName);
		
	}

	public void clickOnAboutUsCheckBox(){
		aboutUsChekBoxButton.click();
		
	}

	
	public void clickOnContinueButton() {
		continueButton.click();
	}

	public String affiliateRegSuccessMessage() {
		String actualMsg = registrationSuccessMessage.getText();
		String subString =actualMsg.substring(0,52);
		return subString;
	}


//	 Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer	

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editAffiliateInformationLink;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransferRadioButtonField;

	@FindBy(id = "input-bank-name")
	private WebElement inputBankName;

	@FindBy(id = "input-bank-branch-number")
	private WebElement inputBranchNumber;

	@FindBy(id = "input-bank-swift-code")
	private WebElement inputSwiftCode;

	@FindBy(id = "input-bank-account-name")
	private WebElement inputAccountName;

	@FindBy(id = "input-bank-account-number")
	private WebElement inputAccuntNumber;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement editAffiliateAcctCheckBoxbutton;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement editContiueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editAffiliateInformationSccMsg;

	public void clickOnEditYourAffiliateInformation() {
		editAffiliateInformationLink.click();
	}

	public void clickOnBankTransferRadioButton() {
		bankTransferRadioButtonField.click();
	}

	public void editBankName(String bankName) {
		inputBankName.clear();
		inputBankName.sendKeys(bankName);
	}

	public void editBranchNumber(String abaNumber) {
		inputBranchNumber.clear();
		inputBranchNumber.sendKeys(abaNumber);
	}

	public void editSwitftCode(String swiftCode) {
		inputSwiftCode.clear();
		inputSwiftCode.sendKeys(swiftCode);
	}

	public void editAccountName(String accountName) {
		inputAccountName.clear();
		inputAccountName.sendKeys(accountName);
	}

	public void editAccountNumber(String accountNumber) {
		inputAccuntNumber.clear();
		inputAccuntNumber.sendKeys(accountNumber);
	}

	public void editAffiliateAcctCheckBoxButton() {
		editAffiliateAcctCheckBoxbutton.click();
		
	}

	public void clickOnEditContinueButton() {
		editContiueButton.click();
	}

	public String getEditAffiliatRegSuccessMsg() {
		String actualText =editAffiliateInformationSccMsg.getText();
		String substringText = actualText.substring(0,52);
		return substringText;
	}

////	Scenario: Edit your account Information

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;

	@FindBy(id = "input-firstname")
	private WebElement editFirstName;

	@FindBy(id = "input-lastname")
	private WebElement editLastName;

	@FindBy(id = "input-email")
	private WebElement editEmail;

	@FindBy(id = "input-telephone")
	private WebElement eidtTelepehon;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement clickOnEditContinueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editAccountSuccessMessageField;


	public void clickOnEditYourAccountInformation() {
		editYourAccountInformation.click();
	}

	public void editFirstName(String firstname) {
		editFirstName.clear();
		editFirstName.sendKeys(firstname);
	}

	public void editLastName(String lastName) {
		editLastName.clear();
		editLastName.sendKeys(lastName);
	}

	public void editEmail(String email) {
		editEmail.clear();
		editEmail.sendKeys(email);
	}

	public void editTelephone(String telephone) {
		eidtTelepehon.clear();
		eidtTelepehon.sendKeys(telephone);
	}

	public void clickOnEditContinteButton() {
		clickOnEditContinueButton.click();
	}

	public String getEditSuccessMessage() {
		String editText = editAccountSuccessMessageField.getText();
		String subStringText =editText.substring(0,52);
		return subStringText;

	}	

}

