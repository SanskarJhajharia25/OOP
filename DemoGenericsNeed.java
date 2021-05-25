package codes;

/*
 * 1. Modify this code and observe when the 
 *    type of object1 and object2 is Object.
 * 2. Check how Generics ensure type safety.
 *  */

class Identity<T,U> {
	 
	private T object1;  // no or name
	private U object2;
 
	Identity(T object1,U object2 ) {
		this.object1 = object1;
		this.object2 = object2;
	}
 
	public T getT() {
		return object1;
	}
	
	public U getU() {
		return object2;
	}
	
}


public class DemoGenericsNeed {
	public static void main(String[] args) {
		Identity<Long,String> I1 = new Identity<Long,String>(9999999999L,"Jen");
		
		System.out.println(I1.getT());   //no
		System.out.println(I1.getU()); 
		
		Identity<String,Long> I2 = new Identity<String,Long>("Jen", 9999999999L);
		
		Long i = I2.getU();
		System.out.println(i);
		String j = I2.getT();
		System.out.println(j);
		
	}
}

