package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class google2 {


			public static WebDriver driver;

			public static void main(String[] args) throws Throwable {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//driver.manage().deleteAllCookies();
				
				driver.get("https://www.google.com/");
				
				driver.findElement(By.name("q")).sendKeys("testing");
				
				Thread.sleep(5000);
				
				List <WebElement> dd_menu=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[3]/span/b"));
				
				for (WebElement e :dd_menu)
				{
					
				
					String innerHTML=e.getAttribute("innerHTML");
				System.out.println("Values from drop down is "+innerHTML);
				
				if  (innerHTML.contentEquals("interview questions"))
				{
					e.click();
					break;
				}
			}
				
				Thread.sleep(5000);
				driver.quit();
				

			}

		

	}


