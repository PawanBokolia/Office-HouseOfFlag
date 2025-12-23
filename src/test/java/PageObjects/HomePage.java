package PageObjects;

import java.util.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage()
	{
		super();
	}
	
	
	@FindBy(xpath= "//button[@id='btn-cookie-allow']")
	WebElement acceptCookies;
	
	@FindBy(xpath="//ul[@id='ui-id-1']/li")
	List<WebElement> megaMenu;
	
	@FindBy(xpath="//span[normalize-space()='National Flags & Stock Flags']")
	WebElement subMenu;
	
	
	@FindBy(xpath="//a[normalize-space()='Contact Us']")
	WebElement contactUsBtn;
	
	@FindBy(xpath="//a[normalize-space()='About Us']")
	WebElement aboutUsBtn;
	
	@FindBy(xpath="//h1[normalize-space()='About Us!']")
	WebElement aboutUsText;
	
	
	
	
	public void acceptCookies()
	{
		try 
		{
			wait.elementWait(acceptCookies);
			js.jsClick(acceptCookies);
		}
		catch(Exception e )
		{
			System.out.println("cookies not present");
		}
	}

	public void hoverOnMegaMenu() throws InterruptedException
	{
		for(int i=0;i<megaMenu.size()-2;i++)
		{
			Thread.sleep(2000);
			act.mouseHover(megaMenu.get(i));		
		}
	}
	

	public void clickOnContactUs()
	{
		js.scrollTo(contactUsBtn);
		contactUsBtn.click();
	}

	public void clickOnAboutUs()
	{
		js.scrollTo(aboutUsBtn);
		aboutUsBtn.click();
	}
	
	public String aboutUsConf()
	{
		return aboutUsText.getText();
	}
	
	public void clickOnSubCategory() 
	{
		act.mouseHover(megaMenu.get(1));
		wait.elementWait(subMenu);
		act.mouseClick(subMenu);
	}




}
