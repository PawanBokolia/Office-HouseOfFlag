package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reusable_JavaScriptExecutor {

	public JavascriptExecutor js;
	
	public Reusable_JavaScriptExecutor(WebDriver driver)  //constructor 
	{
		this.js = (JavascriptExecutor) driver;
	}
	
	public void jsClick(WebElement element)
	{
		js.executeScript("arguments[0].click();", element);
	}
	
	public void scrollTo(WebElement element)
	{
		js.executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
	}

	public void disableHeader(WebElement element)
	{
//		js.executeScript("document.querySelector('div#header').style.pointerEvents='none';");    //work the same as below
		js.executeScript("arguments[0].style.pointerEvents='none';", element);   	//add header in element
	}
	

}
