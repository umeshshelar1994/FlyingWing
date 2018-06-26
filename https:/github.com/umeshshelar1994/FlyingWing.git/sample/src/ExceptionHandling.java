

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//class Test extends Exception {}
class Base extends Exception {
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
		
		   // some other stuff
		   try {
		       // Some monitored code
		       throw new Base();
		    }
		    catch(Derived b)     { 
		       System.out.println("In derived class exception"); 
		    }
		    catch(Base d)  { 
		       System.out.println("In base class exception"); 
		    }
		  }
}
