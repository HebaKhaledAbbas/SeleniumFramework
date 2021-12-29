package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import data.JsonDataReader;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class userRegistrationTestWithDDTAndJSON extends TestBase{

	HomePage HomeObject;
	UserRegistrationPage registerObject;
	LoginPage LoginObject;



	@Test
	public void userCanRegisterSuccessfully() throws FileNotFoundException, IOException, ParseException 
	{
		JsonDataReader jsonReaderObject = new JsonDataReader();
		jsonReaderObject.JsonReader();
		
		HomeObject = new HomePage(driver);
		HomeObject.openRegistrationPage();

		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration(jsonReaderObject.email, jsonReaderObject.password, jsonReaderObject.firstname, jsonReaderObject.lastname);
		Assert.assertTrue(registerObject.welcomingMsg.getText().contains("أهلاً Heba!"));

		HomeObject.userLogout();

		HomeObject.openLoginForm();

		LoginObject = new LoginPage(driver);
		LoginObject.userLogin(jsonReaderObject.email, jsonReaderObject.password);
		Assert.assertTrue(registerObject.welcomingMsg.getText().contains("أهلاً Heba!"));
		
		HomeObject.userLogout();

	}
}
