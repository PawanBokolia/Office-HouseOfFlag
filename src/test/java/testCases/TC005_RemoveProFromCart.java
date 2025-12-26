package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC005_RemoveProFromCart extends BaseClass{

	@Test
	public void RemoveProFromCart() throws InterruptedException
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
		cp.clickOnClearCartBtn();
		cp.clickOnOkToclear();
		
		Assert.assertEquals(cp.clearCartMsg(), "You have no items in your shopping cart.");
		Reusable_Screenshots.Screenshots("TC005_RemoveProFromCart");
	}
}
