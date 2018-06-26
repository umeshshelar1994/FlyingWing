package src;

public class MethodOverloadingDemo {
	
		 
	    // Overloaded sum(). This sum takes two int parameters
	    public int sum(int x, int y) {
	        return (x + y);
	    }
	 
	    // Overloaded sum(). This sum takes three int parameters
	    public int sum(int x, int y, int z) { 
	         return (x + y + z);
	    }
	 
	    // Overloaded sum(). This sum takes two double parameters
	    public double sum(double x, double y) { 
	         return (x + y);
	    }   
	 
	    // Main Method where overloading initiated
	    // This will decide at compile time depending on parameters
	    public static void main(String args[]) { 
	    	MethodOverloadingDemo s = new MethodOverloadingDemo();
	        System.out.println(s.sum(10, 20));
	        System.out.println(s.sum(10, 20, 30));
	        System.out.println(s.sum(10.5, 20.5));
	    }
	

}
