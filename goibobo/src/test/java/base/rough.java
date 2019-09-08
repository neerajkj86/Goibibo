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

public class rough {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().arch32().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		
		driver.get("https://www.goibibo.com");
		Actions act = new Actions(driver);
		
		
	WebElement ele=	driver.findElement(By.id("gosuggest_inputSrc"));
		Thread.sleep(3000);
		
		act.sendKeys(ele, "Mumbai,India(BOM)").perform();
		//act.keyDown(ele, Keys.ARROW_DOWN).keyUp(ele, Keys.ARROW_UP).build().perform();
		//keyDown(ele, Keys.ENTER).build().perform();
		ele.sendKeys(Keys.ARROW_DOWN);
		//ele.sendKeys(Keys.RETURN);
		ele.sendKeys(Keys.ENTER);
		//act.sendKeys(Keys.ARROW_DOWN);
		
		//act.sendKeys(Keys.ENTER);
		//act.keyDown(Keys.ARROW_DOWN).build().perform();
		//act.doubleClick().build().perform();
		//act.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		WebElement element= driver.findElement(By.id("gosuggest_inputDest"));
		//act.doubleClick().build().perform();
		act.sendKeys(element, "Bangalore, India (BLR)").perform();
		
		element.sendKeys(Keys.ARROW_DOWN);
		//ele.sendKeys(Keys.RETURN);
		element.sendKeys(Keys.ENTER);
		//act.keyDown(ele, Keys.ARROW_DOWN).keyUp(ele, Keys.ARROW_UP).build().perform();
		//(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		WebElement elem= driver.findElement(By.xpath("//input[@placeholder='Departure']"));
		
		///WebElement ele= driver.findElement(By.xpath("//*[@id='searchWidgetCommon']/div[1]/div[1]/div[1]/div/div[6]/i"));
		
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", elem);
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fare_20190831']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		

	}

}
