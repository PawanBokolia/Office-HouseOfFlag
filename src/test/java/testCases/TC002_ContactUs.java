package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.ContactUsPage;
import PageObjects.HomePage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC002_ContactUs extends BaseClass{

	@Test
	public void contactUs() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnContactUs();
		
		ContactUsPage cp = new ContactUsPage();
		cp.contactusDetails(faker.randomFirstName(), "chilliapple", faker.randomEmail(), faker.randomPhoneNum(), "test", "test", "test");
		cp.clickOnSubmit();
		
		Assert.assertEquals("Your form have been submitted successfully", cp.sucessMsg());
		Reusable_Screenshots.InstantScreenshot("TC002_ContactUs");
	
	}
}
