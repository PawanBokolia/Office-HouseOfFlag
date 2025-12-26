package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

	public CartPage()
	{
		super();
	}

	
	@FindBy(css="td[data-th='Order Total']")
	WebElement totalPrice;

	@FindBy(css="input[data-role='cart-item-qty']")
	WebElement productQuntity;

	@FindBy(css="button[title='Update Shopping Cart']")
	WebElement updateQuntity;

	//coupon
	@FindBy(id="block-discount-heading")
	WebElement couponCodebtn;
	
	@FindBy(id="coupon_code")
	WebElement couponCodeField;
	
	//checkout button
	@FindBy(css="button[title='Proceed to Checkout']")
	WebElement checkoutBtn;
	
	//clear cart 
	@FindBy(xpath="//button[@name='update_cart_action' and @value='empty_cart']")
	WebElement clearCartBtn;
	
	@FindBy(css="button[class='action-primary action-accept']")
	WebElement okClearBtn;
	
	@FindBy(xpath="//p[normalize-space()='You have no items in your shopping cart.']")
	WebElement noproductMsg;
	
	
	
	public double cartTotal() 
	{
		wait.elementWait(totalPrice);
		String price =totalPrice.getText();
		String cleanprice = price.replaceAll("[^0-9]", "");
		double doublePrice = Double.parseDouble(cleanprice);
		return doublePrice;
	}

	public void changeProQuntity(String value) 
	{
		productQuntity.clear();
		productQuntity.sendKeys(value);
	}

	public void clickOnUpdateQntBtn() 
	{
		wait.elementClickable(updateQuntity);
	}

	public void applyCouponCode(String value) 
	{
		js.scrollTo(couponCodebtn);
		couponCodebtn.click();
		couponCodeField.sendKeys(value);
	}
	
	public void clickOnCheckoutBtn() 
	{
		checkoutBtn.click();
	}
	
	public void clickOnClearCartBtn()
	{
		js.scrollTo(clearCartBtn);
		clearCartBtn.click();
	}
	
	public void clickOnOkToclear()
	{
		wait.elementClickable(okClearBtn);
	}
	
	public String clearCartMsg() 
	{
		return noproductMsg.getText();
	}


}
