package handledropdown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshotLibrary {

	
	public static void captureScreenshot(WebDriver driver) 
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Src = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(Src, new File("./Screenshots/google.png") );
		} 
		catch (IOException e) {
			
		
			e.printStackTrace();
			e.getMessage();
			System.out.println("File not found");
		}
		
		System.out.println("Screenshot Captured");
		
	}
	
}
