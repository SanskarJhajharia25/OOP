package codes;

/*
 * You watch a movie, which turns out to be a slapstick comedy, 
 * where the the lead character would repeat the line "and so be it", 
 * after everything he spoke. In the exercise below, you have to add 
 * certain words to every line that is entered by the user. When the 
 * exercise is run, it will ask you to enter a line of text. 
 * Two variables of type List, called 'words', 'slapstick' is used to store 
 * the words entered by the user and the repeat quote. You have to write code
 * that will add all the contents of 'slapstick' into the variable 'words'.
 * 
 * Expected Output:
 * User input: I love Java
 * Output: I love Java and so be it
 */

import java.util.*;

public class testArrayList {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sentence = scanner.nextLine();
		String wordsArr[] = sentence.split(" ");
		
		// Try to add two null elements in the array.
		String slapStickArr[] = {"and", "so", "be", "it"};
				
		List<String> words, slapstick;
		
		//Instantiate the words and slapstick array lists
		
		
		//Add the elements of wordsArr to words
		
		
		//Add the elements of slapStickArr to slapstick
		
		
		//merge the two array lists into words
		
		
		// print the list 
		StringBuffer buff = new StringBuffer();
		//Replace Iterator with List Iterator
		Iterator<String> iter = words.iterator();
		//Try set(), add(), remove() of ListIterator
				
		while(iter.hasNext()) {
			buff.append((String)iter.next());
			buff.append(" ");
			
			//invoke remove() using array list and iterator reference.
			    
		}
		
		System.out.println(buff.toString());
		System.out.println(words);
		//Try remove() of both Iterator and List Iterator
		//Try set() of ListIterator
		
		System.out.println(words);
		
		//Convert the ArrayList into an Array
		
		
		
		
		scanner.close();
	}
}
