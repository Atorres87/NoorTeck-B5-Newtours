package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//*[text()='REGISTER']")
	WebElement register;

	@FindBy(xpath = "//*[text()='SIGN-ON']")
	WebElement signOn;

	@FindBy(xpath = "//*[text()='Flights']")
	WebElement Flights;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void ClickRegister() {
		click(register);
	}

	public void ClickSignOn() {
		click(signOn);
	}

	public void ClickFlights() {
		click(Flights);

	}

}

