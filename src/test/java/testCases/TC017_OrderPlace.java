package testCases;

import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.HomePage;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC017_OrderPlace extends BaseClass {

	@Test
	public void orderPlace() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.login(p.getProperty("username"), p.getProperty("password"));
		hp.clickOnSubCategory();

		ProductListingPage pp = new ProductListingPage();
		pp.clickOnProduct();
		
		ProductDetailPage pd = new ProductDetailPage();
		pd.clickOnAddTocart();
		pd.clickOnViewCart();
		
		CartPage cp = new CartPage();
		cp.clickOnCheckoutBtn();
	
		CheckoutPage ccp = new CheckoutPage();
		ccp.clickOnSipping();
		ccp.clickOnNextBtn();
		ccp.cashOnDelivery();
		
		Thread.sleep(3000);
		ccp.clickOnOrderPlace();
	}
}
