package exceptionHandling;

public class Demo1 {
public static void main(String[]args) {
	System.out.println("welcome");
	
	String x=null; 
	try {
		
	System.out.println(x.toUpperCase());
	}
	catch(NullPointerException e) {
		System.out.println("dont do like that");
	}
	finally {
		System.out.println("There is no String");
	}
	
	System.out.println("Thank You");
}
}
