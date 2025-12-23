package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC007_ApplyGridView extends BaseClass{

	@Test
	public void applyGridView() throws InterruptedException
	{		
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSubCategory();

		ProductListingPage pp = new ProductListingPage();
		pp.clickOnGridBtn();
		
		Assert.assertEquals(pp.getProductItem(), "ITEMS 1-10 OF 57");
		Reusable_Screenshots.Screenshots("TC007_ApplyGridView");
	}
}
