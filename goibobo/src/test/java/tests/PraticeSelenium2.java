package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PraticeSelenium2 {

	
	public static void main(String[] args) {
		
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	WebElement searchTextBox= driver.findElement(By.name("q"));

	String color= searchTextBox.getCssValue("background-color");
	System.out.println("Color is : "+color);
	String font= searchTextBox.getCssValue("font-size");
	System.out.println("Font is : "+font);
	driver.quit();
	
	//driver.get("https://www.google.com");
//	WebElement searchTextBox= driver.findElement(By.name("q"));
//	String allCssProperties= searchTextBox.getAttribute("style");
//	System.out.println("CSS Properties: "+allCssProperties);
//
//		
		

		
	}
	

}
