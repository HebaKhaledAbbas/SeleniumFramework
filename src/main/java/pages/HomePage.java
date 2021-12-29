package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="dd_header_signInOrUp")
	WebElement SigninBtn;
	
	@FindBy(css="h3.sc-1v3qw6e-7.bjZEio")
	WebElement SignUpLink;
	
	@FindBy(css = "span.userName")
	WebElement MyAccountlink;
	
	@FindBy(css = "button.logOut")
	WebElement SignOutLink;
	
	
	public void openRegistrationPage () 
	{
		clickButton(SigninBtn);
		clickButton(SignUpLink);
	}
	
	public void userLogout () 
	{
		clickButton(MyAccountlink);
		clickButton(SignOutLink);
	}
	
	public void openLoginForm () 
	{
		clickButton(SigninBtn);
	}
	
	
	public void openMyAccountPage () 
	{
		clickButton(MyAccountlink);
	}
	
}
