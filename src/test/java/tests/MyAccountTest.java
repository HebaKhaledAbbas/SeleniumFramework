package tests;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccountTest extends TestBase
{


	HomePage HomeObject;
	UserRegistrationPage registerObject;
	MyAccountPage MyAccountObject;


	@Test(priority =1 , alwaysRun = true)
	public void userCanRegisterSuccessfully() 
	{
		HomeObject = new HomePage(driver);
		HomeObject.openRegistrationPage();

		registerObject = new UserRegistrationPage(driver);
		registerObject.userRegistration("kevijo1419@swsguide.com", "Test@123", "Hiba", "Khaled");
		Assert.assertTrue(registerObject.welcomingMsg.getText().contains("أهلاً Hiba!"));

	}

	@Test(dependsOnMethods = "userCanRegisterSuccessfully")
	public void RegisteredUserCanChangePass() 
	{
		HomeObject.openMyAccountPage();

		MyAccountObject = new MyAccountPage(driver);



		MyAccountObject.openChangePassPopUpStep1();

		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(MyAccountObject.MyAccBtn));
		wait.until(ExpectedConditions.elementToBeClickable(MyAccountObject.MyAccBtn));

		MyAccountObject.openChangePassPopUpStep2();
		MyAccountObject.ChangePassword("Test@123", "Test@1234");


		//ChangePassword Assertion steps  
		MyAccountObject.signOutAfterChangePass();
		Assert.assertTrue(MyAccountObject.loginBtn.getText().contains("تسجيل الدخول"));

	}

}
