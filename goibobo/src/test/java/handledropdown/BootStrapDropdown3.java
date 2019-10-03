package handledropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown3 
{
	
		WebDriver driver;
		@Test
		public void dropdownselect() throws Exception
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		WebElement tutorials=driver.findElement(By.xpath("//*[@id='menu1']"));
		
		//first click on the list box

		tutorials.click();
		
		List <WebElement> dd= tutorials.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
		
		for (int i=0;i<5;i++)
		{
		
			System.out.println(dd.get(i).getText());
			
			if (dd.get(i).getText().equalsIgnoreCase("JavaScript"))
			{
				break;
			}
		
		}
		
	//	System.out.println(dd.size());
		
		Thread.sleep(3000);
		driver.close();
		
		
		}
}
