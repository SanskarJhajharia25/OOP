package codes;

/*
 * Convert the num array and numList to Integer type 
 * and Observe.
 * 
 * Can we solve the issue without converting sum into a 
 * generic method?
 * 
 * Recall: 
 * Integer is a Number i.e. Number N = new Integer(10);
 * But, List<Integer> is not a List<Number>
 */

import java.util.*;

public class testWildcard {
	public static void main(String args[]) {
		
		Number[] num = {1, 2.4, 3, 4.1};
		
		List<Number> numList = Arrays.asList(num);
		
		System.out.println(numList);
		System.out.println(sum(numList));
	}
	
	static double sum(List<Number> list) {
		double total = 0;
		for(Number n:list)
			total += n.doubleValue();
		return total;
	}

}
