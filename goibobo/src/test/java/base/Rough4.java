package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rough4 {

	public static WebDriver driver;
	public static void main(String[] args) {
	
		

		
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
			driver.get("https://www.goibibo.com");
			
			driver.findElement(By.xpath("//*[@id=\"FromTag\"]")).sendKeys("ban");
			

	}

}
