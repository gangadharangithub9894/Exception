package exceptionHandling;

public class Demo4 {
	public static void main(String[]args) {
		System.out.println("welcome");
		String []a= {"ganga","mani","yamuna"};
		for(int i=0;i<a.length;i++) {
			try {
			System.out.println(a[5]);
			}
			catch (ArrayIndexOutOfBoundsException ar) {
				System.out.println(ar);
				//ar.printStackTrace();
			}
			finally {
				System.out.println("ArrayIndexProblm");
			}
			System.out.println("ThankYou");
		}
		
	}

}
