package testCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC008_Pagination extends BaseClass {

	@Test
	public void pagination() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSubCategory();

		ProductListingPage pp = new ProductListingPage();
		pp.clickOnNextBtn(); 						//pagination is not working 
		Reusable_Screenshots.Screenshots("TC008_Pagination");
		
	}
	
}
