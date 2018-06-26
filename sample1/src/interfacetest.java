package src;
 interface a{
	default void get(){
		System.out.println("I am here");
	}
}
public class interfacetest implements a {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1=new interfacetest();
		a1.get();
		
	}

}
