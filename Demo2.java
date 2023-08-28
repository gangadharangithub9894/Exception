package exceptionHandling;

public class Demo2 {
	public static void main(String[]args) {
		System.out.println("Welcome");
		String x="TN07";
		try {
		int y=Integer.parseInt(x);
		}
		catch (ArithmeticException e){
			System.out.println("noFormatproblem");
		}
		catch (NullPointerException f) {
			System.out.println("noFormatproblem");
		}
		catch (NumberFormatException n) {
			System.out.println("its ok by NoFormatExceptionClass");
		}
		catch (Exception ex) {
		
			System.out.println("problem");
		}
		
       
		finally {
			System.out.println("Conversion problem");
		}
		System.out.println(x);
		System.out.println("Thank You");
	}

}
