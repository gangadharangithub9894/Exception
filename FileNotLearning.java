package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotLearning {
	public static void main(String[]args) throws FileNotFoundException, IOException {
		//To find location
		File f=new File ("C:\\Users\\91986\\Documents\\Test.txt");
		//to find is there is value available or not
		FileReader fr=new FileReader(f);
		int temp=0;
		//we don't know where is file start and end we can't use for loop 
		while((temp=fr.read())!=-1) {
			//only gives character
			//this is type costing method
			
			System.out.print((char)(temp));
		}
		
		 
	}

}
