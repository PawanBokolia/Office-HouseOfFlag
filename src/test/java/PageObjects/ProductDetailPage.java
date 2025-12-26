package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage {

	
	public ProductDetailPage()
	{
		super();
	}

	@FindBy(css="#product-addtocart-button")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//div[@class='quickcart-bottom-container']")
	WebElement miniCartPresent;
	
	@FindBy(xpath="//span[contains(text(),'View and edit cart')]")
	WebElement viewCart;

	public void clickOnAddTocart()
	{
		js.scrollTo(addToCartBtn);
		addToCartBtn.click();
	}

	public boolean miniCartPresent() 
	{
		return miniCartPresent.isDisplayed();
	}

	public void clickOnViewCart() 
	{
		wait.elementClickable(viewCart);
	}

}
