package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC012_SearchAutoRecomendation extends BaseClass{

	@Test
	public void searchFunctionality() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnSearchBtn();	
		hp.searchInput(p.getProperty("searchProduct"));
		
		Thread.sleep(3000);
		Assert.assertEquals(hp.productInRecomendation(), p.getProperty("searchProduct"));
		Reusable_Screenshots.Screenshots("TC012_Recomendation");
		//need to fix this
		
		
	
	}
}
