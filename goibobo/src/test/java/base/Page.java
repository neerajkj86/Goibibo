package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import base.Constant;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Page 
{
	
	public static WebDriver driver ;
	
public static void initConfiguration(){
		
		if(Constant.Browser.equals("firefox")){
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			//log.debug("Launching Firefox");
		}else if(Constant.Browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			
		
		driver.get(Constant.testsiteURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

}


public static void quitBrowser(){
	
	driver.quit();
	
}


}