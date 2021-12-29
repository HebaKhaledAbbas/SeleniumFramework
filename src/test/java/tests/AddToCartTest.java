package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToCartPage;
import pages.SearchPage;

public class AddToCartTest extends TestBase{

	SearchPage SearchObject;
	AddToCartPage AddToCartObject;
	
	
	@Test
	public void UserCanAddToCart() 
	{
		SearchObject = new SearchPage(driver);
		SearchObject.SearchForProductByID("10001096");
		
		AddToCartObject = new AddToCartPage(driver);
		AddToCartObject.AddItemtoCart();
		
		Assert.assertTrue(AddToCartObject.assertionElement.getText().contains("في عربة التسوق "));
	}
}
