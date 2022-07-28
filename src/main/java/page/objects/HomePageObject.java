package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement currecyDropwDownField;

	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement selectEuroField;

	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement currencyValueChangeField;

	public void clickOnCurrency() {
		currecyDropwDownField.click();
	}

	public void selectEuroCurrency() {
		selectEuroField.click();
	}

//	public void selectOnDropDownFeild() {
//		Select dropDown = new Select(currecyDropwDownField);
//		dropDown.selectByVisibleText("EUR");
//	}

	public boolean currencyValueChange() {
		if (currencyValueChangeField.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

//	Scenario: User empty Shopping cart message displays 

	@FindBy(xpath = "//span[text()='Shopping Cart']")
	private WebElement shopingCartField;

	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement shoppingCartMessage;

	public void clickOnShoppingCart() {
		shopingCartField.click();
	}

	public boolean shopingCartEmptyText() {
		if (shoppingCartMessage.isDisplayed()) {
			return true;
		} else {
			return false;

		}
	}
}
