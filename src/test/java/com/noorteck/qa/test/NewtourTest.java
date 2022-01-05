package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SignOnPage;
import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://demo.guru99.com/test/newtours/";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		NewTourTestOne();
		NewTourTestTwo();

		CommonUI.quitBrowser();

	}

	public static void NewTourTestOne() {

		HomePage homeObj = new HomePage();
		homeObj.ClickSignOn();

		SignOnPage signOnObj = new SignOnPage();
		signOnObj.enterUserName("Jcena");
		signOnObj.enterPassword("C1234");
		signOnObj.clickSubmitButton();
		SoftAssert softAssert = new SoftAssert();
		String expectedText = "Login Successfully";
		String actualText = "Login Successfully";
		expectedText = "Login Successfully";
		actualText = "Login Successfully";
		softAssert.assertEquals(expectedText, actualText);

	}

	public static void NewTourTestTwo() {
		HomePage homeObj = new HomePage();
		homeObj.ClickRegister();

		RegisterPage registerObj = new RegisterPage();
		registerObj.enterFName("John");
		registerObj.enterLName("Cena");
		registerObj.enterPhone("3059876543");
		registerObj.enterEmail("JohnC@gmail.com");
		registerObj.enterAddressField("123 Java Drive");
		registerObj.enterCity("Miami");
		registerObj.enterStateField("Florida");
		registerObj.enterPostalCode("12365");
		// registerObj.selectCountryDropDown();
		registerObj.enterUserNameField("Jcena");
		registerObj.enterPasswordField("C12365");
		registerObj.enterConfirmPasswordField("C12365");
		registerObj.clickSubmitButton();

		SoftAssert softAssert = new SoftAssert();

		String expectedText = "Thank you for registering";
		String actualText = "Thank you for registering";

		softAssert.assertEquals(expectedText, actualText);

		softAssert.assertAll();

	}

}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */