package handledropdown;



public class MultiThreading {

	
	
	//both thread is caling at same time so scedular is going to decide which thread to call based on the priority given by thread.
	// by default all the request are handled by main thread.
	
	
	public static void main(String[] args) 
	{

	
		Runnable obj1 = new B();
		Runnable obj2 = new D();
		
		Thread t1 = new Thread(obj1);
		
		Thread t2 = new Thread(obj2);
		
		
		t1.start(); //thread is having start but runnable is having only run abstract method 
		t2.start();
	
}

	
	
	}  
	


class B implements Runnable
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

class D implements Runnable
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






















