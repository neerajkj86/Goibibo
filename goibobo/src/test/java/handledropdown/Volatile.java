package handledropdown;



public class Volatile {

	
	
	//both thread is caling at same time so scedular is going to decide which thread to call based on the priority given by thread.
	// by default all the request are handled by main thread.
	
	
	public static void main(String[] args) 
	{

	
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		
		
		obj1.start();
		obj2.start();
	
}

	
	
	}  
	


class Hi extends Thread
{
	public void run()
	{
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try {Thread.sleep(1000);} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}

class Hello extends Thread 
{
	public void run()
	{
		
		for (int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}

}






















