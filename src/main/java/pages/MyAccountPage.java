package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button.link")
	WebElement ProfileLink;
	
	@FindBy(css= "span.sc-3sq6ro-5.ipBapM")
	public WebElement MyAccBtn;

	@FindBy(css = "span.dyoqji-1.hTssjK")
	WebElement ChangePassBtn;

	@FindBy(id = "password")
	WebElement CurrentPassTxtbox;

	@FindBy(id="newPassword")
	WebElement NewPassTxtbox;

	@FindBy(css = "button.n66aa8-6 gAbpYh.confirm")
	WebElement OkBtn;

	@FindBy(css = "button.sc-66f8eg-3.ixpBTq")
	WebElement SignOutLink;
	
	@FindBy(id = "dd_header_signInOrUp")
	public WebElement loginBtn;               //for assertion 


	public void openChangePassPopUpStep1() 
	{
		clickButton(ProfileLink);
	}
	public void openChangePassPopUpStep2()
	{
		clickButton(MyAccBtn);
		clickButton(ChangePassBtn);
	}

	public void ChangePassword(String oldpass, String newpass)
	{
		setTxtElementTxt(CurrentPassTxtbox, oldpass);
		setTxtElementTxt(NewPassTxtbox, newpass);
		clickButton(OkBtn);
	}
	public void signOutAfterChangePass() 
	{
		clickButton(SignOutLink);
	}
}
