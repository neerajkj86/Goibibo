package passwordencryption;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassMouseHowerDemo 
{
	//adding comments for git
	WebDriver driver;
	
	
	
	@Test
	public void passwordEncryptions() throws Exception
	{
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//WebDriverWait wait = new WebDriverWait(driver, 20);

	driver.get("https://www.flipkart.com/");
	
	
String path =System.getProperty("user.dir");
	
	System.out.println(path);
	
	
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9650139442");
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(decodeString("UGFzc0AxMjM0NQ=="));
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
	
	
	//WebElement dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='container']/div/div[2]/div/ul/li[3]/span")));
	
	
	Thread.sleep(3000);
	
	
	
	
	
	
	
	driver.close();
	
	
	}
	
	
	
	
	public static String decodeString(String Password)
	{
		//byte[] encodeString =Base64.encodeBase64(s.getBytes());
		
		byte[] decodeString=	Base64.decodeBase64(Password);
		
		return new String(decodeString);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}	