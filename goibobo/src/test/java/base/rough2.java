package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rough2 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().arch32().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		
		driver.get("https://www.cleartrip.com/");
		Actions act = new Actions(driver);
		
		
		driver.findElement(By.xpath("//*[@id=\"FromTag\"]")).sendKeys("Mumbai, IN - Chatrapati Shivaji Airport (BOM)");
		act.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ToTag\"]")).sendKeys("Bangalore, IN - Kempegowda International Airport (BLR)");
		act.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Departure']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ele);
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fare_20190826']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		

	}

}
