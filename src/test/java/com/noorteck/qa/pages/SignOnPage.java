package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI {

	@FindBy(xpath = "//input[@name='userName']")
	WebElement userNameField;

	@FindBy(xpath = "//*[@type='password']")
	WebElement passwordField;

	@FindBy(xpath = "//*[@type='submit']")
	WebElement submitButton;

	@FindBy(xpath = "//*[text()='Login Successfully'")
	WebElement loginConfirmationMessage;

	@FindBy(css = "//*[contains(text(),'Thank you for Loggin')]")
	WebElement thankYouforloging;

	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}

	public void enterPassword(String password) {
		enter(passwordField, password);
	}

	public void clickSubmitButton() {
		click(submitButton);

	}

	public static boolean isDisplayed(WebElement element) {
		try {

			return element.isDisplayed();

		} catch (Exception e) {

			System.out.println("Element is not displayed:" + element);
			e.printStackTrace();

			return false;
		}
}

}


