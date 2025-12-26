package testCases;

import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.HomePage;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC015_ApplyCouponCode extends BaseClass {

	@Test
	public void applyCoupon()
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
		cp.applyCouponCode(p.getProperty("coupon"));
		
		//need to complete
	}
}
