package codes;

/*
 * You are planning to create a student database. 
 * You will add a person to the database only if his name is unique.
 * 
 * Sample Input:
 * 5
 * tom hanks
 * tom holland
 * tom holland
 * tom hanks
 * mary ann
 * 
 * Sample Output:
 * 1
 * 2
 * 2
 * 2
 * 3
 */
import java.util.*;
class Name
{
    String first, last;
    
    Name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }

}

/* The class Name that has first and last name as it members
 * Modify the code using the Name class
 */

public class testHashSet {
	public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.nextLine());
        
        String [] pair_left = new String[N];
        String [] pair_right = new String[N];
        
        for (int i = 0; i < N; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        
        
        s.close();
    }
}
