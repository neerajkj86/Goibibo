package handledropdown;



import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class CaptureScreenshot3 {


	public static WebDriver driver;
	@Test
	public static void captureScreenshot() throws IOException
	{
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");
	CaptureScreenshotLibrary3.captureScreenshot(driver);
		
//		TakesScreenshot ts = (TakesScreenshot)driver; //Take Screenshot Interface type casting
//		
//	File Source=ts.getScreenshotAs(OutputType.FILE);
//	
//	FileUtils.copyFile(Source,new File("./Screenshots/google.png") );
	
	//System.out.println("Screenshot Captured");
		
//		CaptureScreenshotLibrary2.captureScreenshot(driver, "GoogleHome");
  driver.quit();
//		
		
	}





	


}









