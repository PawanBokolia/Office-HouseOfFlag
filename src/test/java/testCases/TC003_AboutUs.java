package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC003_AboutUs extends BaseClass{

	@Test
	public void aboutUs() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnAboutUs();
		
		Assert.assertEquals(hp.aboutUsConf(),"ABOUT US!");
		Reusable_Screenshots.Screenshots("TC003_AboutUs");
	}
}
