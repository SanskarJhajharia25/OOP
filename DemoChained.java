package codes;

//Uncomment Line A and Line B to understand the impact of Chained Exceptions

import java.util.*;

class NoLeaveGrantedException extends RuntimeException {

	public NoLeaveGrantedException(String message) {
		super(message);
	}
	public String toString() {
		return this.getMessage();
	}
	
}

class NoBalanceException extends RuntimeException {

	public NoBalanceException(String message) {
		super(message);
	}
	public String toString() {
		return this.getMessage();
	}
	
}

public class DemoChained {
	public static void main(String args[]) {
		try {
		getLeave();}
		catch(NoLeaveGrantedException e) {
			System.out.print(e);
		//	System.out.print(e.getCause());  //Line A
		}
		
	}

	static void getLeave() throws NoLeaveGrantedException {
		try {
			checkBalance();
		} catch (NoBalanceException e) {
			NoLeaveGrantedException ne = new NoLeaveGrantedException("Leave not sanctioned.");
			//ne.initCause(e);		//Line B
			throw ne;
		}
	}

	static void checkBalance() throws NoBalanceException {
		throw new NoBalanceException("No Balance Leave");
	}

}

