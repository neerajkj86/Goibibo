package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;


import base.Page;

public class HomePage extends Page
{
	
	
	

	@FindBy(tagName = "h1")
	public WebElement heading;
	
	
	@FindBy(css="input#gosuggest_inputSrc")
	public WebElement FromCity;
	
	@FindBy(css="input#gosuggest_inputDest")
	public WebElement TOCity;
	
	
	@FindBy(xpath="//input[@placeholder='Departure']")
	public WebElement ClickonDate;
	
	
	@FindBy(xpath="//*[@id='fare_20190829']")
	public WebElement SelectCurrentDate;
	
	
	@FindBy(xpath="//button[@type = 'submit']")
	public WebElement SearchButton;
	
	//Constructor
public HomePage(){
		
		
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this);
		
	}
	
	
	
	public Boolean VerifyIsPageOpened()
	{
		return heading.getText().contains("Flight Ticket Booking");
		
	}
	
	
	public void bookAFlight(String from, String to)
	{
		FromCity.sendKeys(from);

		TOCity.sendKeys(to);
		
		ClickonDate.click();
		
		SelectCurrentDate.click();
		
		SearchButton.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void clikOnJoin(){
		SearchButton.click();
	   }
}
