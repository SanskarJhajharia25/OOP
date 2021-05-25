package codes;


/* Write the following methods that return a lambda expression performing a 
 * specified action:
 * 
 * PerformOperation isOdd():   The lambda expression must return true if a number 
 							   is odd or false if it is even.
 * PerformOperation isPrime(): The lambda expression must return true if a number
  							   is prime or false if it is composite.
 * PerformOperation isPalin(): The lambda expression must return true if a 
 							   number is a palindrome or false if it is not.
 */
import java.io.*;
import java.util.*;
interface PerformOperation {
	boolean check(int a);
}
class MyMath {
	public boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isOdd()
	{
		return null;
		
	}

	public PerformOperation isPrime()
	{
		return null;
		
	}

	public PerformOperation isPalin()
	{
		return null;
		
	}
}

public class testLambda {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		PerformOperation op =null;
		String ans1 = null, ans2 = null;

		while (T--> 0) {
			String s = br.readLine();

			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());

			switch(ch) {
			case 1: op = ob.isOdd();
					ans1 = "ODD";
					ans2 = "EVEN";
					break;
			case 2: op = ob.isPrime();
					ans1 = "PRIME";
					ans2 = "COMPOSITE";
					break;
			case 3: op = ob.isPalin();
					ans1 = "PALINDROME";
					ans2 = "NOT PALINDROME";
					break;
			}

			System.out.println(ob.checker(op, num)? ans1:ans2);
		}
	}
}
