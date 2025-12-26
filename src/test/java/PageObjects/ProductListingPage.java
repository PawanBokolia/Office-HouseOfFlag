package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductListingPage extends BasePage{

	public ProductListingPage()
	{
		super();
	}

	//filters
	@FindBy(xpath="//div[normalize-space()='Size']")
	WebElement sizeFileter;

	@FindBy(css="div.swatch-option.text")
	WebElement selectSizeFilter;

	@FindBy(xpath="//div[contains(text(),'Color')]")
	WebElement colorFilter;

	@FindBy(css="div.swatch-option.color")
	WebElement SelectblackColor;

	//filter present
	@FindBy(css="li[role='presentation']")
	WebElement filterPresent;

	//grid 
	@FindBy(id="mode-list")
	WebElement gridBtn;

	@FindBy(css="p#toolbar-amount")
	WebElement productShowing;

	//pagintation
	@FindBy(xpath="//li[@class='item pages-item-next']/a")
	WebElement nextBtn;

	//product per page 
	@FindBy(id="limiter")
	WebElement productPerpage;
	
	@FindBy(xpath="//select[@id='limiter']/option[@selected='selected']")
	WebElement productselected;
	
	//select any product
	@FindBy(xpath="//a[@aria-label='Product Page Link']")
	List<WebElement> productPresentperPage;
	
	

	public void clickOnSizeFilter() 
	{
		js.scrollTo(sizeFileter);
		sizeFileter.click();
	}

	public void selectSizeFilter() 
	{
		js.scrollTo(selectSizeFilter);
		selectSizeFilter.click();
	}

	public void clickOnColorFilter() 
	{
		js.scrollTo(colorFilter);
		colorFilter.click();
	}

	public void selectColorFilter() 
	{
		js.scrollTo(SelectblackColor);
		SelectblackColor.click();
	}

	//filter present
	public boolean filterPresent() 
	{
		return filterPresent.isDisplayed();
	}

	public void clickOnGridBtn()
	{
		js.scrollTo(gridBtn);
		gridBtn.click();
	}

	public String getProductItem() 
	{
		return productShowing.getText();
	}

	public void clickOnNextBtn() throws InterruptedException 
	{
		while(true) 
		{
			try
			{
				Thread.sleep(2000);
				js.scrollTo(nextBtn);
				Thread.sleep(2000);
				js.jsClick(nextBtn);
			}
			catch(Exception e)
			{
				break;
			}
		}
	}

	public void selectPEoductPerPage(String value)
	{
		js.scrollTo(productPerpage);
		Select drp = new Select(productPerpage);
		drp.selectByValue(value);
	}
	
	public boolean compareProductcount() throws InterruptedException 
	{
		boolean compare = false;
		String productPerPageValue = productselected.getText();
		
		int count = productPresentperPage.size();
		String Stringcount = Integer.toString(count);
		js.scrollTo(productPerpage);

		if(productPerPageValue.equals(Stringcount))
		{
			compare = true;
		}
		
		return compare;
	}

	//product
	public void clickOnProduct() 
	{
		js.scrollTo(productPresentperPage.get(1));
		productPresentperPage.get(1).click();
	}
	
	public void ClickOnWishListBtn() 
	{
		
	}

}