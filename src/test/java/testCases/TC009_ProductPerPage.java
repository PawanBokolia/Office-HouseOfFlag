package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC009_ProductPerPage extends BaseClass{

	@Test
	public void productPerPage() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSubCategory();

		ProductListingPage pp = new ProductListingPage();
		pp.selectPEoductPerPage("24");
		
		Thread.sleep(5000);
		Assert.assertTrue(pp.compareProductcount());
		
		Reusable_Screenshots.Screenshots("TC009_ProductPerPage");
		
		
	}
}
