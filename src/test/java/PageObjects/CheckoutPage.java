package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {
	
	public CheckoutPage()
	{
		super();
	}

	@FindBy(xpath="//fieldset[@id='customer-email-fieldset']/div/div/input")
	WebElement email;
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(name="company")
	WebElement company;
	
	@FindBy(name="street[0]")
	WebElement streetAdd;
	
	//street address 
	@FindBy(xpath="//input[@placeholder='Search your postcode']")
	WebElement searchPostalCode;
	
	@FindBy(css="button[class='idpc-button']")
	WebElement findMyAddress;
	
	@FindBy(xpath="//select[@aria-label='Select your address']")
	WebElement psotalCodeDrp;
	
	@FindBy(xpath="//div[@class='idpc_af']/ul/li")
	List<WebElement> streetDrpValue;
	
	@FindBy(name="telephone")
	WebElement phoneNo;
	
	//shipping
	@FindBy(xpath="//tr[@data-bind='click: element.selectShippingMethod']/td[1]/input")
	WebElement shippingRdo;
	
	@FindBy(css="button.button.action.continue.primary")
	WebElement nextBtn;
	
	@FindBy(name="region_id")
	WebElement regionDrp;
	
	//Payment method
	@FindBy(id="magenest_sagepay_direct")
	WebElement sagepayRadio;
	
	@FindBy(css="input[title='Credit Card Holder']")
	WebElement cardHolderName;
	
	@FindBy(css="input[title='Credit Card Number']")
	WebElement cardNo;
	
	@FindBy(name="payment[cc_exp_month]")
	WebElement expMonth;
	
	@FindBy(name="payment[cc_exp_year]")
	WebElement expYear;
	
	@FindBy(name="payment[cc_cid]")
	WebElement 	cvv;
	
	//cash on delivery
	@FindBy(id="cashondelivery")
	WebElement cashOnDelivery;
	
	//Order place button
	@FindBy(xpath="//div[@class='payment-method _active']//button[@title='Place Order']")
	WebElement orderPlaceBtn;
	
	public void fillAddress(String eInput,String fname,String lname,String comInput,String phone) 
	{
		email.sendKeys(eInput);
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		company.sendKeys(comInput);
		phoneNo.sendKeys(phone);
	}
	
	public void streetAddress(String add) throws InterruptedException // not in use 
	
	{
		streetAdd.sendKeys(add);
		Thread.sleep(4000);
		js.scrollTo(streetDrpValue.get(0));
		streetDrpValue.get(0).click();
	}
	
	public void searchPostalCode(String code) 
	{
		searchPostalCode.sendKeys(code);   	//DE6 2FX
		findMyAddress.click();
		Select drp = new Select(psotalCodeDrp);
		drp.selectByValue("13");
	}
	
	
	public void clickOnSipping() 
	{
		js.scrollTo(shippingRdo);
		wait.elementClickable(shippingRdo);
	}
	
	public void clickOnNextBtn() 
	{
		js.scrollTo(nextBtn);
		nextBtn.click();
	}
	
	public void selectRegionDrp()
	{
		Select drp = new Select(regionDrp);
		drp.selectByValue("1101");
	}
	
	public void paymentMethodSagePay(String name,String cardNum,String month,String year,String cvvNumber) 
	{
		wait.elementClickable(sagepayRadio);
		cardHolderName.sendKeys(name);
		cardNo.sendKeys(cardNum);
		
		Select drpMonth = new Select(expMonth);
		drpMonth.selectByValue(month);
		
		Select drpYear = new Select(expYear);
		drpYear.selectByValue(year);
		cvv.sendKeys(cvvNumber);
	}

	public void cashOnDelivery() 
	{
		cashOnDelivery.click();
	}
	
	public void clickOnOrderPlace() 
	{
		js.scrollTo(orderPlaceBtn);
		orderPlaceBtn.click();
	}

	

}
