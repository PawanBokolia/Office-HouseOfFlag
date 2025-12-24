package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.Reusable_Screenshots;

public class TC011_RegistorUser extends BaseClass{
	
	@Test
	public void registorUser() throws InterruptedException
	{
		HomePage hp = new HomePage();
		hp.acceptCookies();
		hp.clickOnCreateAcount();
		
		CreateAccountPage cp = new CreateAccountPage();
		cp.createAccount(faker.randomFirstName(), "chilliapple", faker.randomEmail(), "pawan@96", "pawan@96");
		
		MyAccountPage mp = new MyAccountPage();
		Thread.sleep(3000);
		Assert.assertEquals(mp.getCreateAccMsg(), "If you are a registered VAT customer, please click here to enter your billing address for proper VAT calculation.");
		Reusable_Screenshots.Screenshots("TC011_RegistorUser");
	}

}
