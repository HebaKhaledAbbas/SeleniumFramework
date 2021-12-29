package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="searchBar")
	public WebElement SearchTxtBox;
	
	
	
	//@FindBy(css = "sc-14cxujr-2 hjcYvE")
	//public WebElement assertionText;
	
	public void SearchForProductByID(String value) 
	{
		
		setTxtElementTxt (SearchTxtBox, value);
		SearchTxtBox.submit();
		
	}
	
}
