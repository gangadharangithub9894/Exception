package exceptionHandling;

public class Demo {
	public static void main(String[]args) {
	System.out.println("welcome");
	int a=10;
	int b=2;
    int c=0;
    try {
    System.out.println(a/c);
    }
   // catch(Exception e) {
    //	System.out.println("Don't try divide Zero with anyNumber");
    //	}
    // Exact match class
    catch(ArithmeticException e) {
    	System.out.println("Dont try divide zero with anyNum");
    			
    }
    System.out.println(a/b);
    System.out.println("Thank You");
    System.out.println("savegit");
		
	}
	

}
