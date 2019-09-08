package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Page;
import pages.HomePage;

public class FlightSearchTest 
{
	
	
	
		
		@BeforeTest
		public void setUp(){
			
			Page.initConfiguration();
			
			
		}
		
		
		@Test
		public void FlightSearch() throws InterruptedException
		{
			HomePage hp = new HomePage();
			
			//Check if page is opened
			Assert.assertTrue(hp.VerifyIsPageOpened());
			
			hp.bookAFlight("Mumbai(BOM)", "Bangalore(BLR)");
			//Thread.sleep(5000);
			
			
			
			///assert.assertTrue(condition);
			
		}
		
		
		@AfterTest
		public void teardown()
		{
			if(Page.driver!=null){
			Page.quitBrowser();
		}
		

}
}