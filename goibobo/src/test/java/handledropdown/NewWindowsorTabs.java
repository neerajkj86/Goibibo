package handledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowsorTabs {

	WebDriver driver;
		
	@BeforeClass
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
		
	}
		@Test
		public void MultipleTab() throws Exception
		{
		
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	String parent=	driver.getWindowHandle();
			
	System.out.println("Parent window id is"+parent);
			
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		//WebDriver newtab =driver.switchTo().newWindow(WindowType.TAB);
		WebDriver newtab =driver.switchTo().newWindow(WindowType.WINDOW);
		
		newtab.get("https://www.google.com/");
		
		System.out.println(newtab.getTitle());
		
		newtab.findElement(By.name("q")).sendKeys("Neeraj");
		
		Thread.sleep(2000);
		
		newtab.close(); //control will not transfer back to parent window so we need to manually go to parent window first
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(withTagName("input").above(By.xpath("//*[@id=\"forgotPasswordLink\"]/a"))).click();
		Thread.sleep(2000);
		
		}
		@AfterClass
		public void tearDown()
		{
			driver.close();
		}
		

	

}
