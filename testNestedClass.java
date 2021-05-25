package codes;


class Robot {
	 
    private int id;
    static String str1 ="Robot ";

    // Add static to str2 and observe
    private class Brain {
    	String str2 = " is thinking.";
        public void think() {
            System.out.println(str1 + id + str2);    // Non-static nested classes have access to the enclosing class's instance data. 
            
        }
    }
    
    // Try to print str1 and id together with str3
    // Add a static method display and try to access it in the inner class
    // Remove the static keyword and observe.
    // Observe when outer and inner class has same method signature: both for static and non-static cases
    private static class Battery {
    	String str3 = "Battery charging...";
        public void charge() {
            System.out.println(str3);     // static inner classes do not have access to instance data.
        }
    }
     
    public Robot(int id) {
        this.id = id;
    }
 
    public void start() {
        System.out.println("Starting robot " + id);
         
        Brain brain = new Brain();   // Line A
        brain.think();               // Line B
        //Can we access str2 here?
                
        Battery battery = new Battery();    // Line C
        battery.charge();					// Line D
         
        String name = "Robert";
            
        class Temp {
            public void doSomething() {
                System.out.print("My name is " + name+str1);
                System.out.println(" and ID is: " + id);
            }
        }
         
        Temp temp = new Temp();   // Local classes can be used only within the method where they are defined.
        temp.doSomething();
    }
}


public class testNestedClass {
	 public static void main(String[] args) {
	     
	        Robot robot = new Robot(7);
	        robot.start();
	         
	        /*Comment lines A and B
	         * Modify the access modifier of Brain to public. 
	         * Invoke the method think() in the inner class Brain
	         */
	         
	        /*Comment lines C and D
	         * Modify the access modifier of Battery to public.
	         * Invoke the charge() method in the Static inner class Battery
	         */
	        
	        
	   }
}
