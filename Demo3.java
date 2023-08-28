package exceptionHandling;

public class Demo3 {
	public static void main(String[]args) {
		System.out.println("Welcome");
		String x="Ganga";
		try {
		System.out.println(x.charAt(7));
		}
		catch(IndexOutOfBoundsException e){
			//System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Thank You");
		
	}

}
