package handledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo 
{
	
	WebDriver driver ;
	@Test
	public void Drop() throws Throwable
	
	
	{
		
WebDriverManager.chromedriver().setup();

//DesiredCapabilities ds = new DesiredCapabilities();
//
//ChromeOptions opt = new ChromeOptions();
//
//opt.addArguments(arguments)
//		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='country']"));
		Select obj = new Select(ele);
		
		obj.selectByVisibleText("INDIA");
		
		
		
	//	driver.close();
		

}
}