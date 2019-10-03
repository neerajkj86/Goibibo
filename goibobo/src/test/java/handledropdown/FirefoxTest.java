package handledropdown;



import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
//FirefoxOptions option = new FirefoxOptions();
//
//option.setAcceptInsecureCerts(true);
//
//option.addArguments("disable-infobars");
		 String driverPath ="C:\\Driver\\geckodriver-v0.19.0-win32\\geckodriver.exe";

		System.setProperty("webdriver.gecko.driver", driverPath);
		
	//	C:\Driver\geckodriver-v0.19.0-win32
driver = new FirefoxDriver();
	
	
		
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		//WindowsUtils.killByName("chrome.exe");
		
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");
		
		
		
		
		driver.findElement(By.name("q")).sendKeys("testing");
	
		
		Thread.sleep(3000);
	
		driver.close();
	}

}
