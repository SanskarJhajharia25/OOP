package codes;

/*
 * Can you include Run-time Polymorphism using Interfaces to invoke showInfo()
 * 
 * Assume that there are 'n' different Machines and it is required to include
 * Machine started and stopped generic methods in all these classes. What is the efficient 
 * way to include these additions in the Machines class.
 * 
 *  Is there a way to provide the implementation for static String outputInfo() method,
 *  instead of having its implementation at the client end?
 */
interface Info {
    String showInfo();
    
}

class Machine1 implements Info {
    
    private final int id;
    Machine1(int id){
    	this.id =id;
    }
     
    public String showInfo() {
        return "ID is: " + id;
    }
}

class Person implements Info {
    
    private String name;
     
    public Person(String name) {
        this.name = name;
    }
 
    public void greet() {
        System.out.println("Hello there.");
    }
 
    @Override
    public String showInfo() {
        return "Name is: " + name;
    }
}


public class testDefaultInterface {
	public static void main(String[] args) {
        
        Machine1 mach1 = new Machine1(7);
       // mach1.start();
         
        Person person1 = new Person("Bob");
        person1.greet();
        
        Info info = mach1;
        System.out.println(info.showInfo());
         
        Info info1 = person1;
        System.out.println(info1.showInfo());
         
        System.out.println();
         
        System.out.println(outputInfo(mach1));
        System.out.println(outputInfo(person1));
    }
	
	private static String outputInfo(Info info) {
        return info.getClass().getSimpleName()+" "+info.showInfo();
    }
}
