package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC004_SelectingSizeFilter extends BaseClass {

	@Test
	public void sizeFilter() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSubCategory();
		
		ProductListingPage pp = new ProductListingPage();
		pp.clickOnColorFilter();
		pp.selectSizeFilter();
		
		Assert.assertTrue(pp.filterPresent());
		Reusable_Screenshots.Screenshots("TC004_SelectingSizeFilter");
	
	
	
	}
}
