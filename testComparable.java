package codes;

import java.util.*;

/*
 * The player class has 2 fields: name (String), score(Integer).
 * Sort the array of n player objects in order of decreasing score 
 * using Comparable interface.
 * If two or more players have same score, then sort the players
 * alphabetically by name.
 * 
 * Sample Input: 
 * 5
 * 
 * tom 100
 * tom 150
 * tom 50
 * david 200
 * ann 50
 * 
 * Sample Output:
 * david 200
 * tom 150
 * tom 100
 * ann 50
 * tom 50
 */

class Player implements Comparable<Player>{
	String name;
	int score;

	Player(String name, int score){
		this.name = name;
		this.score = score;
	}

	
}

class testComparable {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		Player[] player = new Player[n];

		for(int i = 0; i < n; i++){
			player[i] = new Player(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player);
		for(int i = 0; i < player.length; i++){
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}
