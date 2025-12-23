package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC006_SelectingColorFilter extends BaseClass{

	@Test
	public void colorFilter() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSubCategory();

		ProductListingPage pp = new ProductListingPage();
		pp.clickOnColorFilter();
		pp.selectColorFilter();
		Assert.assertTrue(pp.filterPresent());
		Reusable_Screenshots.Screenshots("TC006_SelectingColorFilter");
	}
}
