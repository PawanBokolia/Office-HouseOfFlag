package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
	List<WebElement> nextBtn;




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
			if(nextBtn.size() > 0)
			{
				Thread.sleep(2000);
				js.scrollTo(nextBtn.get(0));
				Thread.sleep(2000);
				js.jsClick(nextBtn.get(0));
			}
			else
			{
				break;
			}
		}
	}


}
