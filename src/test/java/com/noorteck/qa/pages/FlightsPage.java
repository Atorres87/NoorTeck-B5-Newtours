package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI{
	
	
	@FindBy(xpath = "//*[@value='roundtrip")
	WebElement clickRoundTrip;
	
	@FindBy(xpath ="//*[@value='oneway']")
	WebElement clickOneWay;
	
	@FindBy(xpath="//*[@name='passCount']")
	WebElement PassengerCount;
	
	@FindBy(xpath ="//*[@name='fromPort']")
    WebElement DepartingFrom;
	
	@FindBy(xpath = "//*[@name='fromMonth']")
	WebElement DepartingMonth;
	
	@FindBy(xpath = "//*[@name='fromDay']")
	WebElement OnDay;
	
	@FindBy(xpath = "//*[@name='toPort']")
	WebElement ArrivingIn;
	
	@FindBy(xpath = "//*[@name='toMonth']")
	WebElement ReturningMonth;
	
	@FindBy(xpath = "//*[@name='toDay']")
	WebElement returningDay;
	
	@FindBy(xpath = "//*[@value='Coach']")
	WebElement EconomyClass;
	
	@FindBy(xpath = "//*[@value='Business']")
	WebElement BusinessClass;
	
	@FindBy(xpath = "//*[@value='First']")
	WebElement FirstClass;
	
	@FindBy(xpath = "//*[@name='airline']")
	WebElement  noAirlinePreference;
	
	@FindBy(xpath ="//*[@name='findFlights']")
	WebElement clickContinue;
	
	@FindBy(xpath = "//*[@size= '4']")
	WebElement message;
	
	
	
	
	
	
}
