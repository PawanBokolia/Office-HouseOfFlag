package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC014_ProductQuntityChange extends BaseClass {

	@Test
	public void quntityChange() throws InterruptedException
	{

		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSubCategory();

		ProductListingPage pp = new ProductListingPage();
		pp.clickOnProduct();
		
		ProductDetailPage pd = new ProductDetailPage();
		pd.clickOnAddTocart();
		pd.clickOnViewCart();
		
		CartPage cp = new CartPage();

		double expectedPrice = cp.cartTotal()*4;
		System.out.println(expectedPrice);
		cp.changeProQuntity("4");
		cp.clickOnUpdateQntBtn();
		
		Thread.sleep(3000);
		Assert.assertEquals(cp.cartTotal(),expectedPrice);
		Reusable_Screenshots.Screenshots("TC014_ProductQuntityChange");
		
		
		
		
		
	}
}
