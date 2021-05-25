package codes;

/*
 * Observe the following scenarios.
 * 
 * 1. What if Printable's print returns void and Showable's print returns int?
 * 2. What happens when Trial implements both Printable and Showable?
 * 3. Replace default with static in Printable
 * 4. Replace default with static in both Printable and Showable.
 * 5. Can Trail's reference access the show() method directly?
 * 6. Include a static method display() in Trial and try accessing it via Trail's reference.
 */

interface Printable{  
	void print(); 
	default void show()
	{
		System.out.println("Within Printable Show");
	}
}  
interface Showable{  
	default void show()
	{
		System.out.println("Within Showable Show");
	}
	void print();
} 

class Trial implements Printable{

	public void print() {
		System.out.println("Within Print"); 
		}

}

public class DemoDefaultStaticInterfaces {
	public static void main(String[] args) {
		Trial t = new Trial();
		t.print();
		t.show();		
		
	}
}

