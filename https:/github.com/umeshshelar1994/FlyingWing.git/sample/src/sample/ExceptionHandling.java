package sample;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//class Test extends Exception {}
class Base extends IOException {
	public Base()
	{
		System.out.println("in Base");
	}
}
class Derived extends Base   {
	public Derived()
	{
		System.out.println("in Derived");
	}
}
 
public class ExceptionHandling {

	public static void main(String[] args)  {
		/* try {
	         throw  10;
	      }
	      catch(int e) {
	         System.out.println("Got the  Exception " + e);
	      }*/
		
		  /*    try {
		         throw new Test();
		      }
		      catch(Test t) {
		         System.out.println("Got the Test Exception");
		      }
		      finally {
		         System.out.println("Inside finally block ");
		      }
		  }*/
		
		
		
		   // some other stuff
		   try {
		       // Some monitored code
		       throw new Base();
		    }
		    catch(Derived b)     { 
		       System.out.println("Caught base class exception"); 
		    }
		    catch(Base d)  { 
		       System.out.println("Caught base class exception"); 
		    }
		  }
		
		
	     
	

}
