package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {

	@FindBy(xpath = "//*[@name='firstName']")
	WebElement firstNameField;

	@FindBy(xpath = "//*[@name='lastName']")
	WebElement lastNameField;

	@FindBy(xpath = "//*[@name='phone']")
	WebElement phoneField;

	@FindBy(xpath = "//*[@name='userName']")
	WebElement emailField;

	@FindBy(xpath = "//*[@name='address1']")
	WebElement addressField;

	@FindBy(xpath = "//*[@name='city']")
	WebElement cityField;

	@FindBy(xpath = "//*[@name='state']")
	WebElement stateField;

	@FindBy(xpath = "//*[@name='postalCode']")
	WebElement postalCodeField;

	@FindBy(xpath = "//b[contains(text(),'Country')]")
	WebElement dropDownCountry;

	@FindBy(xpath = "//*[@name='email']")
	WebElement userNameField;

	@FindBy(xpath = "//*[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//*[@name='confirmPassword']")
	WebElement confirmPasswordField;

	@FindBy(xpath = "//*[@name='submit']")
	WebElement submitButton;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterFName(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterLName(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}

	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterAddressField(String address) {
		enter(addressField, address);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void enterStateField(String state) {
		enter(stateField, state);
	}

	public void enterPostalCode(String postalCode) {
		enter(postalCodeField, postalCode);
	}

	public void chooseCountryDropDown(String methodName, String indexTextValue) {
		selectFromDropdown(dropDownCountry, methodName, indexTextValue);
	}

	public void enterUserNameField(String userName) {
		enter(userNameField, userName);
	}

	public void enterPasswordField(String password) {
		enter(passwordField, password);
	}

	public void enterConfirmPasswordField(String confirmPassword) {
		enter(confirmPasswordField, confirmPassword);
	}

	public void clickSubmitButton() {
		click(submitButton);

	}

	boolean firstNameField1;
	
		
		
	}

