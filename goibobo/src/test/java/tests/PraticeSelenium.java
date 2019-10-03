package tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PraticeSelenium {

	
	public static void main(String[] args) {
		
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		//js.executeScript("alert('hello world');");
//
//		System.currentTimeMillis();
//	
//		String sText =  js.executeScript("return document.title;").toString();
//		
//		System.out.println("Title of the page is "+sText);
//		
//		js.executeScript("window.scrollBy(0,150)");
		
		//WebDriverWait wait = new WebDriverWait(driver,5);
		
		WebElement t=driver.findElement(By.name("q"));
		
		t.sendKeys("testing");
		
		List <WebElement> dd_menu=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[3]/span/b"));
		
		for (WebElement e:dd_menu )
		{
			String INNERHTML =e.getAttribute("innerHTML");
			System.out.println(INNERHTML);
		}
		
		
		//System.out.println(t.getAttribute("innerHTML"));
		
	String titleValue=	t.getAttribute("title");
		
		System.out.println("Value of title attribute: "+titleValue);
		
		

		
	}
	

}
