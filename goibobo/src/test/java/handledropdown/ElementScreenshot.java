package handledropdown;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		

		driver.get("https://www.google.com/");
		
		WebElement ele = driver.findElement(By.name("q"));
		
	
	File srcfile =	ele.getScreenshotAs(OutputType.FILE);
	
	//FileUtils.copyFile(srcfile, ".target\\Screenshots\\email.png");
	
	String path = System.getProperty("user.dir");
	
	//System.out.println(path);
	FileUtils.copyFile(srcfile, new File(path+"\\target\\Screenshots\\email.png"));
	driver.quit();
	
	
		
	}

}
