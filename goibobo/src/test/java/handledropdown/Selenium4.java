package handledropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup(); //alternate to system.set property command 
		
		ChromeOptions ops = new ChromeOptions();
		
		ops.addArguments("--disable-notifications");
		
//		String proxy = "199.201.32.345:8080";
//		WebDriverManager.chromedriver().proxy("proxy");
		
		// webdriver manager download the binary file at local system 
		WebDriver driver = new ChromeDriver(ops);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
	WebElement ele=	driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"));
	
	
	
	File src = ele.getScreenshotAs(OutputType.FILE);
	
	String path = System.getProperty("user.dir")+"/Screenshots/captcha.png";
	
	try {
		FileHandler.copy(src,new File(path));
	} catch (IOException e) {
		
		e.getMessage();
		
	}
		
		
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,5000)");
	
	
	Thread.sleep(5000);
	
	
	
	
	driver.quit();
		
		

	}

}
