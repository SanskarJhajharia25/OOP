package codes;


/*
 * Ask a user for a ID number. A valid id number should have 10 digits 
 * and they must all be numbers.
 * 
 * 1. throw a NumberFormatException is when the number is not valid 10 digit number.
 * 2. Create a user-defined exception class for checking the no. of digits in ID;
 * 	  Write a method appendZero() that appends trailing zeros to make it 10 digits
 * 
 */
import java.util.*;


public class testException {
	public static void main(String args[]) {

		Scanner scanner=new Scanner(System.in); 
		String input="";
		int num=0,i=0; 

		System.out.println("Enter the ID number:");  
		input = scanner.next(); 
		scanner.close();
		try{
		//Write you code here	
				 
			System.out.println("correct");
		}
		
		catch(NumberFormatException e){
			System.out.print(e.getMessage());
			System.out.println(" Not a valid number");
		} 
		
		System.out.println(num);
		
	}

}
