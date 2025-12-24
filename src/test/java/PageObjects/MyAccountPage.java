package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage()
	{
		super();
	}

	@FindBy(css="span.base")
	WebElement MyAccountTitle;
	
	@FindBy(xpath="//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
	WebElement createAccountMsg;

	public String myAccountTitle() 
	{
		return MyAccountTitle.getText();
	}

	public String getCreateAccMsg()
	{
		return createAccountMsg.getText();
	}



}
