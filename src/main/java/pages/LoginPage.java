package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(id="emailInput")
	WebElement emailTxtbox;

	@FindBy(id="passwordInput")
	WebElement passwordTxtbox;

	@FindBy(id="login-submit")
	WebElement SigninBtn;

	public void userLogin (String email, String Password) 
	{
		setTxtElementTxt(emailTxtbox, email);
		setTxtElementTxt(passwordTxtbox, Password);
		clickButton(SigninBtn);
	}
}
