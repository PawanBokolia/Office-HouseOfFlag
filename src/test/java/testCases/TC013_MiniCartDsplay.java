package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC013_MiniCartDsplay extends BaseClass{

	@Test
	public void miniCart() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSubCategory();

		ProductListingPage pp = new ProductListingPage();
		pp.clickOnProduct();
		
		ProductDetailPage pd = new ProductDetailPage();
		pd.clickOnAddTocart();

		Thread.sleep(3000);
		Assert.assertTrue(pd.miniCartPresent());
		Reusable_Screenshots.Screenshots("TC013_MiniCartDsplay");
		
	}	
}
