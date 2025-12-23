package testCases;

import org.testng.annotations.Test;

import PageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC001_MegaMenu extends BaseClass {

	@Test
	public void megaMenu() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.hoverOnMegaMenu();
		
		Reusable_Screenshots.Screenshots("TC001_MegaMenu");
	}
}
