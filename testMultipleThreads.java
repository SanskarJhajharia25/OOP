package codes;

/*
 * Create three threads and each has a copy of the Counter object
 * 
 * Thread 1 is given the priority 5 and should increment twice.
 * Thread 2 is given the priority 6 and should increment thrice.
 * Thread 3 is given the priority 7 and should increment four times.
 */
class Counter {
    int count;
    void inc() {
        count = count+1;
        
        System.out.println("counter value of "+Thread.currentThread().getName()+" is: " + getCount());
        try {
    		Thread.sleep(500);}
    		catch(InterruptedException e) {	}
    }
    int getCount() {
        return count;
    }
}

//Create the class for multi-threading
class IncrementerThread  {
	Counter counter;        
	int noOfIncr;   
	
	IncrementerThread(String name, int no, int p){
		
		
	}
	
    public void run() {
        for (int i = 0;i<noOfIncr ; i++) {
            counter.inc();
        }
    }
}

public class testMultipleThreads {
	public static void main(String args[]) {
		int noOfThreads = 3;
		int i;	
		IncrementerThread t[] = new IncrementerThread[noOfThreads];
		/*Execute the child threads for infinite no. of times and 
		 * Comment the Thread.sleep statement in the child thread and Observe.
		 */
		
		//Observe when all the three child threads have same priority
		
		/* Let the main thread sleep for 1000ms only. Observe the output.
		 * How to ensure that the main thread is the last to finish?
		 */
		
		for(i = 0; i<noOfThreads;i++)
			// Thread Creation
		for(i = 0; i<noOfThreads;i++)
			//Start the threads

		try {
			Thread.sleep(3000);}
			catch(InterruptedException e) {	}
		
		for(i = 0; i<noOfThreads;i++)
			//Stop the threads
		
		for(i = 0; i<noOfThreads;i++)
			System.out.println("Actual final value of counter"+i+" is: " + t[i].counter.getCount());
		
	}

}
