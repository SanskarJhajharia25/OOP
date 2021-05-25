package codes;

import java.util.*;

//Functional Interface
interface FuncInt{
	double getValue();
}

//Generic Functional Interface
interface GenericInt<T> {
    T func(T t);
} 

public class DemoLambda {
	static double average(FuncInt f,int n) {
		return f.getValue()/n;
	}
	
	
	public static void main(String args[]) {
		
		List<Integer> intList = Arrays.asList(2,4,6,8);
		/*forEach method in List specifies an action to be performed on
		 * elements of the list i.e. its takes a Lambda expression*/
		 
		//Expression Lambda
		intList.forEach((n) -> System.out.print(n + " "));
		System.out.println();
		
		//Write a Block Lambda for intList.forEach
				
		//Write Block Lambda for intList.forEach with Local variable
					
		//Implementing functional interfaces using Expression Lambdas
		
		FuncInt f1 = ()->Math.random()*100;  //instance
		System.out.println(f1.getValue());
		
		//Passing code as data
		System.out.println("The average is: "+ average(f1, 100));
		
		//Implementing functional interfaces using Block Lambdas
		
		FuncInt f2 = ()->{
			double total = 0;
			
			for(Number n:intList) {
				total+=n.doubleValue();
			}
			return total;
		};
		
		
		
		System.out.println(f2.getValue());
		
		//Passing code as data
		System.out.println("The average is: "+ average(f2, intList.size()));
		
		
		
		//Generic functional interface using Lambda
		
		GenericInt<String> reverse = (String str)-> new StringBuffer(str).reverse().toString();  
        
		System.out.println("Lambda reversed = " + reverse.func("Lambda"));
        
      GenericInt<Integer> factorial = n ->{
    	  Integer fact = 1;
    	  for(int i = 1;i<=n;i++)
    		  fact*=i;
    	  return fact;
      }; 
		
      System.out.println("Factorial = " + factorial.func(5));
        
		
	}
}
