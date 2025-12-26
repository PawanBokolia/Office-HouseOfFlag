package testCases;

import org.testng.annotations.Test;

import PageObjects.CartPage;
import PageObjects.CheckoutPage;
import PageObjects.HomePage;
import PageObjects.ProductDetailPage;
import PageObjects.ProductListingPage;
import testBase.BaseClass;

public class TC016_GuestOrder extends BaseClass {

	@Test
	public void guestOrder() throws InterruptedException
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
		cp.clickOnCheckoutBtn();
		
		CheckoutPage ccp = new CheckoutPage();
		
		ccp.fillAddress(faker.randomEmail(), faker.randomFirstName(), "Chilliapple", "test", "123456789");
		ccp.searchPostalCode("DE6 2FX");
		ccp.selectRegionDrp();
		ccp.clickOnSipping();
		ccp.clickOnNextBtn();

		//payment method
		ccp.paymentMethodSagePay("test", p.getProperty("cardNo"), "7", "2026", "123");
		ccp.clickOnOrderPlace();
		
		Thread.sleep(10000);
		//need to fix the payement 
	}
	
}
