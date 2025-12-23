package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

	public ContactUsPage()
	{
		super();
	}
	
	@FindBy(xpath="(//div[@class='control'])[1]/input")
	WebElement firstName;
	
	@FindBy(xpath="(//div[@class='control'])[2]/input")
	WebElement lastName;
	
	@FindBy(xpath="(//div[@class='control'])[3]/input")
	WebElement emailInput;
	
	@FindBy(xpath="(//div[@class='control'])[4]/input")
	WebElement phoneNoInput;
	
	@FindBy(xpath="(//div[@class='control'])[5]/input")
	WebElement businessName;
	
	@FindBy(xpath="(//div[@class='control'])[6]/input")
	WebElement locationInput;
	
	@FindBy(xpath="(//div[@class='control'])[7]/textarea")
	WebElement queryInput;
	
	@FindBy(xpath="(//div[@class='control'])[8]/input")
	WebElement checkBox;
	
	@FindBy(xpath="(//button[normalize-space()='Submit'])[1]")
	WebElement submitBtn;
	
	@FindBy(css="div[data-ui-id='message-success']")
	WebElement successMsg;
	
	
	public void contactusDetails(String firstname,String lastname,String email,String phoneno,String businessno,String location,String query)
	{
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		emailInput.sendKeys(email);
		phoneNoInput.sendKeys(phoneno);
		businessName.sendKeys(businessno);
		locationInput.sendKeys(location);
		queryInput.sendKeys(query);
		js.scrollTo(checkBox);
		wait.elementClickable(checkBox);
	}
	
	public void clickOnSubmit() 
	{
		submitBtn.click();
	}
	
	public String  sucessMsg() 
	{
		wait.elementWait(successMsg);
		return successMsg.getText();
	}


}
