package codes;

/*
 * Write a generic method that returns the maximum among three elements
 * Modify the code such that maximum method is used only on Numerical 
 * objects.
 */



public class testCompInGenerics {
	public static void main(String[] args) {
		System.out.printf("Max of %d, %d and %d is %d\n\n", 
				3, 4, 5, maximum( 3, 4, 5 ));
//		System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n",
//				6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ));    
//		System.out.printf("Max of %s,%s and %s is %s\n\n",
//				"s", "j", "r", maximum( "s", "j", "r" )); 
	}
	public static Integer maximum(Integer x, Integer y, Integer z) {
		Integer max = x;      
		if(y.compareTo(max) > 0) 
			max = y;        
		if(z.compareTo(max) > 0) 
			max = z;         
		return max;         
	}
}

