package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase
{
	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="emailInput")
	WebElement emailtxtbox;
	
	@FindBy(id="passwordInput")
	WebElement Passwordtxtbox;
	
	@FindBy(id="firstNameInput")
	WebElement FirstNametxtbox;
	
	@FindBy(id="lastNameInput")
	WebElement LastNametxtbox;
	
	@FindBy(id="login-submit")
	WebElement CreateAccountBtn;
	
	@FindBy(css="span.userName")
	public WebElement welcomingMsg;
	
	
	public void userRegistration (String email, String Password, String FN , String LN ) 
	{
		setTxtElementTxt(emailtxtbox, email);
		setTxtElementTxt(Passwordtxtbox, Password);
		setTxtElementTxt(FirstNametxtbox, FN);
		setTxtElementTxt(LastNametxtbox, LN);
		clickButton(CreateAccountBtn);
	}
}
