package tests;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchProductTest extends TestBase
{

	
	SearchPage SearchObject;
	
	@Test
	public void UserCanSearchForProducts() 
	{
		SearchObject = new SearchPage(driver);
		SearchObject.SearchForProductByID("apple AirPods pro");
		//Assert.assertTrue(SearchObject.assertionText.getText().contains("apple AirPods pro"));
	}
}
