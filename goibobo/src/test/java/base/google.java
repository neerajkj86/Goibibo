package base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class google {


			public static WebDriver driver;
			
			static List <WebElement> dd_menu;

			public static void main(String[] args) throws Throwable {
				
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//driver.manage().deleteAllCookies();
				
				driver.get("https://www.google.com/");
				
				driver.findElement(By.name("q")).sendKeys("Java");
				
				Thread.sleep(5000);
				
				try
				{
				dd_menu=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[3]/span"));
				}
				
				catch(StaleElementReferenceException e)
				{
					e.printStackTrace();
				}
				System.out.println(dd_menu.size());
				
				for (int i=0;i<dd_menu.size();i++)
				{
					//System.out.println(dd_menu.get(i).getText());
					
					if (dd_menu.get(i).getText().contains("javascript tutorial"))
					{
						dd_menu.get(i).click();
						break;
					}
				}
					
				driver.quit();

			}

		

	}


