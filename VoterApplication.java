package exceptionHandling;

import java.util.Scanner;

public class VoterApplication {
	public static void main(String[]args)throws VoterAgeException{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=s.nextLine();
		System.out.println(name);
		
		System.out.println("Enter your Age:");
		int age=s.nextInt();
		if(age>18) {
			System.out.println("You are Elgible");
			
		}
		else {
			throw new VoterAgeException("age is below 18");
		}
		System.out.println("Enter Your gender:");
		String gender=s.next();
		System.out.println(gender);
		
 	
	}
	}


