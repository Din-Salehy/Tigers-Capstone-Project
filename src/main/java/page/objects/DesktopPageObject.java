package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopFeild;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktopField;

	public void clickOnDesktops() {
		desktopFeild.click();
	}

	public void clickOnShowAllDesktops() {
		showAllDesktopField.click();
	}
//Scenario: User verify all items are present in Desktops tab

	@FindBy(tagName = "img")
	private List<WebElement> desktopItem;

	public List<WebElement> desktopItems() {
		List<WebElement> desktopItems = desktopItem;
		return desktopItems;
	}

//Scenario: User add HP LP 3065  from Desktops tab to the cart

	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hplp306tField;

	@FindBy(id = "input-quantity")
	private WebElement hpQuantityField;

	@FindBy(id = "button-cart")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement HPLPsuccessMsField;

	public void clickOnHpLp3065() {
		hplp306tField.click();
	}

	public void slectQuanity(String quantity) {
		hpQuantityField.clear();
		hpQuantityField.sendKeys(quantity);
	}

	public void clickAddToCartBtn() {
		addToCartBtn.click();
	}

	public boolean HPLPSuccessMessage() {
		if (HPLPsuccessMsField.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

//Scenario: User add Canon EOS 5D from Desktops tab to the cart

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOSField;

	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement dropDownFeild;

	@FindBy(id = "input-quantity")
	private WebElement inputQuantity;

	@FindBy(id = "button-cart")
	private WebElement canonAddToCartField;

	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	private WebElement canonSuccessFeild;

	public void clickOnEOS5DCamera() {
		canonEOSField.click();

	}

	public void selectOnDropDownFeild() {
		Select dropDown = new Select(dropDownFeild);
		dropDown.selectByValue("15");
	}

	public void addQauntity(String quantity) {
		inputQuantity.clear();
		inputQuantity.sendKeys(quantity);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addToCartCanon() {
		canonAddToCartField.click();
	}

	public boolean cannonSuccessMassage() {
		if (canonSuccessFeild.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}


//Scenario: User add a review to Canon EOS 5D item in Desktops tab	

	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOSField2;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement reviewField;

	@FindBy(id = "input-name")
	private WebElement yourNameField;

	@FindBy(id = "input-review")
	private WebElement yourReviewField;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> rating;

	@FindBy(id = "button-review")
	private WebElement reviewContinueField;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement reviewMessageField;

	public void clickOnCanonEOSLink() {
		canonEOSField2.click();
	}

	public void clickOnReviewLink() {
		reviewField.click();
	}

	public void enterYourName(String nameValue) {
		yourNameField.sendKeys(nameValue);
	}

	public void enterReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	}

	public void selectRating(String ratingValue) {
		List<WebElement> listRating = rating;
		for (WebElement element : listRating) {
			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}

	}

	public void clickOnReviewContinuteButton() {
		reviewContinueField.click();
	}

	public boolean reviewSubmissionMessage() {
		if (reviewMessageField.isDisplayed()) {
			return true;
		} else {
			return false;

		}
	}
}
