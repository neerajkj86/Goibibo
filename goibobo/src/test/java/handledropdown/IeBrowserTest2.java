package handledropdown;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

public class IeBrowserTest2 {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
Logger log = Logger.getLogger("devpinoyLogger");


	InternetExplorerOptions options = new InternetExplorerOptions();
	
	//options.setPageLoadStrategy(strategy.u)
	
	options.enablePersistentHovering();
	
	options.ignoreZoomSettings();
	
	options.requireWindowFocus();
	
	options.introduceFlakinessByIgnoringSecurityDomains();
	options.takeFullPageScreenshot();

	
	
		
		
WebDriverManager.iedriver().arch32().setup();
		
		

driver = new InternetExplorerDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     
		
		driver.get("https://www.google.com/");
		
		log.info(" the user landed on the Home Page");
		
	//	WindowsUtils.killByName("chrome.exe");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		
		driver.findElement(By.name("q")).sendKeys("testing");
	
		Thread.sleep(3000);
	
		driver.close();
	}

}
