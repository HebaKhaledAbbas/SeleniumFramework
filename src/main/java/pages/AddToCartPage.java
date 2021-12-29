package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase{

	public AddToCartPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(css = "img.sc-71905c-1.eytPMO")
	WebElement selectItem;
	
	@FindBy(css = "div.loaderCtr.inactiveLoading")
	WebElement addToCartBtn;
	
	@FindBy(css = "div.sc-1b1a4gv-7.eDSWqJ")
	public WebElement assertionElement;
	
	
	public void AddItemtoCart() 
	{
		clickButton(selectItem);
		clickButton(addToCartBtn);
	
	}
	
}
