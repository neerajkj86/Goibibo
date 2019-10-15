package handledropdown;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Uploadfile {

	public static void main(String[] args) throws Throwable 
	{
		
		WebDriverManager.chromedriver().setup(); //alternate to system.set property command 
		
		// webdriver manager download the binary file at local system 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://demo.guru99.com/test/upload/");

		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\jainne\\Pictures\\Saved Pictures\\Home tution.jpg");
		
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		Thread.sleep(5000
				);
		driver.quit();
		
		
	}
	
}