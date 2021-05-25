package codes;

/*
 * We have a Counter and there are two classes.
 *  class Increment, increments the counter (Producer) and 
 *  class Reader, reads the current value of the counter (Consumer)
 *  
 *  Observe that the code fails to meet requirement of Producer-Consumer problem
 */
class CounterIPC {
    private int count;

    void inc() {
    	  count = count+1;
          System.out.println("count incremented by"+Thread.currentThread().getName()+" is: " + count);
        }
    int getCount() { 	
         return count;
    }
}

class Incrementer extends Thread {
CounterIPC counter;
static int numberOfIncrements;   
	
	Incrementer(CounterIPC counter){
		this.counter = counter;
	}
	
	public void run() {	
		for (int i = 0; i < numberOfIncrements; i++) {
			synchronized(counter) {
            	counter.inc();
            }
        }
    }
}

class Reader extends Thread {
CounterIPC counter;
static int numberOfIncrements;   
	
	Reader(CounterIPC counter){
		this.counter = counter;
	}

	public void run() {	
        for (int i = 0; i < numberOfIncrements; i++) {
        	synchronized(counter) {
            System.out.println("count read by"+Thread.currentThread().getName()+" is: " + counter.getCount());
            }
        }
    }
}

public class DemoIPC {
	public static void main(String args[]) {
		int noOfThreads = 3;
		Incrementer.numberOfIncrements = 4;
		
		Incrementer t[] = new Incrementer[noOfThreads];
		CounterIPC counter = new CounterIPC();
		
		
		for(int i = 0; i<noOfThreads;i++)
			t[i] = new Incrementer(counter);
		
		for(int i = 0; i<noOfThreads;i++)
			t[i].start();
		
		Reader R = new Reader(counter);
		Reader.numberOfIncrements = Incrementer.numberOfIncrements* noOfThreads;
		R.start();
			
		
		try {
		Thread.sleep(2000);}
		catch(InterruptedException e) {	}				
	}

}
