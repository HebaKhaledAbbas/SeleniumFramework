package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class userRegistrationTest extends TestBase{

	HomePage HomeObject;
	UserRegistrationPage registerObject;
	LoginPage LoginObject;
	
	
	
	@Test(priority =1 , alwaysRun = true)
	public void userCanRegisterSuccessfully() 
	{
		HomeObject = new HomePage(driver);
		HomeObject.openRegistrationPage();
		
		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration("xolesif369@ritumusic.com", "Test@123", "Hiba", "Khaled");
		Assert.assertTrue(registerObject.welcomingMsg.getText().contains("أهلاً Hiba!"));
	}
	
	
		@Test(dependsOnMethods = {"userCanRegisterSuccessfully"})
		public void RegisteredUserCanLogout() 
		{
		  HomeObject.userLogout();
		}
		
		
		
		@Test(dependsOnMethods = {"RegisteredUserCanLogout"})
		public void RegisteredUserCanLogin() 
		{
		
		HomeObject.openLoginForm();
		
		LoginObject = new LoginPage(driver);
		LoginObject.userLogin("xolesif369@ritumusic.com", "Test@123");
		Assert.assertTrue(registerObject.welcomingMsg.getText().contains("أهلاً Hiba!"));
		}
}
