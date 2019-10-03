package passwordencryption;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkartdemo {

	
	
		WebDriver driver;
		@Test
		public void dropdownselection() throws Exception
		{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert al=driver.switchTo().alert();
		
		al.dismiss();
		
	WebElement ele =driver.findElement(By.xpath("//form[@class='_1WMLwI header-form-search']//descendant::input[1][@name='q']"));
		
	System.out.println(ele.isEnabled());
	
	ele.
		
		
		

	}

}
