package refelectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


/**
 * @author JainNe
 * with the help of reflection API we can get the information about private method also 
 * in testng we can print the method name that is going to execute by create a befroe method for that test and like m.getname will print the method name
 *
 */
public class Home {

	public static void main(String[] args) {
		
		ReflectionDemo obj = new ReflectionDemo();
		
		Class clazz =obj.getClass();
		
		System.out.println(clazz.getName());
		
	Method[]arrayofMethods=	clazz.getDeclaredMethods();
	
	int size =arrayofMethods.length;

	
	System.out.println(size);
	
	for (Method m:arrayofMethods )
		
	{
		System.out.println(m.getName());
	}
	
	
	Constructor[] arrayofcons =clazz.getConstructors();
	
	int sizee = arrayofcons.length;
	
	System.out.println(sizee);
	
	for (Constructor c:arrayofcons)
	{
		System.out.println(c.getName());
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
