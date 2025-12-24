package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

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

	//cms page
	@FindBy(xpath="//a[normalize-space()='Contact Us']")
	WebElement contactUsBtn;

	@FindBy(xpath="//a[normalize-space()='About Us']")
	WebElement aboutUsBtn;

	@FindBy(xpath="//h1[normalize-space()='About Us!']")
	WebElement aboutUsText;

	//login
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
	WebElement loginPanel;
	
	@FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Create')]")
	WebElement createAccount;

	@FindBy(name="login[username]")
	WebElement usernameInput;

	@FindBy(name="login[password]")
	WebElement passwordInput;

	@FindBy(name="send")
	WebElement loginBtn;

	@FindBy(css="div[class='panel header'] button[type='button']")
	WebElement loginOptonbtn;

	@FindBy(xpath="//li[@class='customer-welcome active']//li")
	List<WebElement> loginOption;

	@FindBy(xpath="//span[@class='base']")
	WebElement signOutText;

	//search
	@FindBy(xpath="//i[@class='open-modal-search icon-search3']")
	WebElement searchBtn;
	
	@FindBy(id="search")
	WebElement searchText;
	
	@FindBy(xpath="//ul[@class='product-list']/li")
	List<WebElement> productInSearch;

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

	//login
	public void login(String username,String pwd) 
	{
		loginPanel.click();
		usernameInput.sendKeys(username);
		passwordInput.sendKeys(pwd);
		wait.elementClickable(loginBtn);
	}

	public void clickOnLoginOption()
	{
		wait.elementClickable(loginOptonbtn);
	}

	public void clickOnMyAccount() 
	{
		wait.elementClickable(loginOption.get(0));
	}

	public void clickOnLogout() 
	{
		wait.elementClickable(loginOption.get(1));
	}

	public String getLogOutMsg()
	{
		return signOutText.getText();
	}
	
	public void clickOnCreateAcount()
	{
		wait.elementClickable(createAccount);
	}

	public void clickOnSearchBtn() 
	{
		searchBtn.click();
	}
	
	public void searchInput(String product)
	{
		searchText.sendKeys(product);
	}
	
	public String productInRecomendation()
	{
		return productInSearch.get(0).getText();
	}
	
	
	
}
