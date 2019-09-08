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

public class rough3 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.goibibo.com");
		//Actions act = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//driver.findElement(By.id("gosuggest_inputSrc")).sendKeys("Mumbai (BOM)");
		
		js.executeScript("document.getElementById('gosuggest_inputSrc').value='Agra (AGR)';");
		
		//act.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		//driver.findElement(By.id("gosuggest_inputDest")).sendKeys("Bangalore (BLR)");
		
		js.executeScript("document.getElementById('gosuggest_inputDest').value='Bangalore (BLR)';");
		//act.sendKeys(Keys.TAB);
		Thread.sleep(3000);
		//WebElement ele= driver.findElement(By.xpath("//input[@placeholder='Departure']"));
		
		WebElement ele= driver.findElement(By.cssSelector
("div.width100.fl.padTB20.fltHpyWdgt.posRel:nth-child(1) div.fltHypContain.posRel div.dF.justifyBetween.flexWrap:nth-child(1) div.col-md-11.pad0.dF.width90.flexWrap.justifyCenter div.col-md-12.pad0.dF.flexWrap.brdrRd5.marginB10.fltHpySrchWrp.whiteBg div.dF.whiteBg.col-sm-5.alignItemsCenter.col-md-2:nth-child(6) > input.inputSrch.curPointFlt"));
		
		
		
		js.executeScript("arguments[0].click();", ele);
		
		System.out.println("clicked on date table");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='fare_20190826']")).click();
		Thread.sleep(3000);
		System.out.println("clicked on date");
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		

	}

}
