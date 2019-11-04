package handledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators3 {

	WebDriver driver;
		
	@BeforeClass
	public void setup()
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");	
	}
		@Test
		public void dropdownselection() throws Exception
		{
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//driver.findElement(withTagName("input").below(By.id("txtPassword"))).click();
		
	//	driver.findElements(withTagName("img").below(By.xpath("//*[@id=\"footer\"]/div[1]/a")));
		
		List<WebElement> sociallinks=driver.findElements(withTagName("img").below(By.xpath("//a[text()='OrangeHRM, Inc']")));
		
		System.out.println(sociallinks.size());
		
		for (WebElement ele : sociallinks)
		{
			System.out.println(ele.getAttribute("alt"));
		}
		
		
		
		
		
		
		
		
		
		
		
		}
		@AfterClass
		public void tearDown()
		{
			driver.close();
		}
		

	

}
