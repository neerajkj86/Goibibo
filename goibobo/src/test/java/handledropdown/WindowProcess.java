package handledropdown;

import org.openqa.selenium.os.WindowsUtils;

public class WindowProcess {

	public static void main(String[] args) 
	{
		
		WindowsUtils.killByName("geckodriver.exe");
		
		System.out.println(WindowsUtils.thisIsWindows());
	
		
		System.out.println(WindowsUtils.getProgramFilesPath());
		
		

	}

}
