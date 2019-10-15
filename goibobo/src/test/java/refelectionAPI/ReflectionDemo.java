package refelectionAPI;

import org.testng.annotations.Test;

public class ReflectionDemo 
{
	
	@Test(priority = 1,groups ="sniff")
	public void Reflection()
	{
		System.out.println("test1");
	}
	
	@Test(priority = 2,groups="sniff")
	public void show()
	{
		System.out.println("test2");
	}
	
	@Test(priority = 3,groups="regression")
	public void add()
	{
		System.out.println("test3");
	}
	
	@Test(priority = 4,groups="regression")
	public void print()
	{
		System.out.println("test4");
	}
	

}
