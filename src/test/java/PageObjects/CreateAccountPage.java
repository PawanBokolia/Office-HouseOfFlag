package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends BasePage{

	public CreateAccountPage()
	{
		super();
	}

	@FindBy(name="firstname")
	WebElement firstnameInput;

	@FindBy(name="lastname")
	WebElement lastNameInput;

	@FindBy(name="email")
	WebElement emailInput;	
	
	@FindBy(name="password")
	WebElement passwordInput;

	@FindBy(name="password_confirmation")
	WebElement passwordConfInput;

	@FindBy(id="send2")
	WebElement submitBtn;	
	
	public void createAccount(String fname,String lname,String email,String pwd,String cnfPwd)
	{
		firstnameInput.sendKeys(fname);
		lastNameInput.sendKeys(lname);
		emailInput.sendKeys(email);
		passwordInput.sendKeys(pwd);
		passwordConfInput.sendKeys(cnfPwd);
		wait.elementClickable(submitBtn);
	}
	
	


}
