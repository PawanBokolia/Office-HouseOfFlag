package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC010_LoginAndLogOut extends BaseClass{
	
	@Test
	public void loginAndLogout()
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.login(p.getProperty("username"), p.getProperty("password"));
		hp.clickOnLoginOption();
		hp.clickOnMyAccount();
		
		MyAccountPage ap = new MyAccountPage();
		Assert.assertEquals(ap.myAccountTitle(), "MY ACCOUNT");
		Reusable_Screenshots.InstantScreenshot("TC010_LogIn");
		
		hp.clickOnLoginOption();
		hp.clickOnLogout();
		
		Assert.assertEquals(hp.getLogOutMsg(), "YOU ARE SIGNED OUT");
		Reusable_Screenshots.InstantScreenshot("TC010_LogOut");
		
	}

}
