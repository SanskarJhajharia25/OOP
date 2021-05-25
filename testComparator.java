package codes;

import java.util.*;

/*
 * The player class has 2 fields: name (String), score(Integer).
 * Sort the array of n player objects in order of decreasing score. 
 * If two or more players have same score, then sort the players
 * alphabetically by name.
 * Create a Checker class that implements the Comparator interface.
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

//Write your Checker class here
class Checker implements Comparator<PlayerC>{
	

}

class PlayerC {
	String name;
	int score;

	PlayerC(String name, int score){
		this.name = name;
		this.score = score;
	}

}

class testComparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		PlayerC[] player = new PlayerC[n];
		Checker checker = new Checker();

		for(int i = 0; i < n; i++){
			player[i] = new PlayerC(scan.next(), scan.nextInt());
		}
		scan.close();

		Arrays.sort(player,checker);
		for(int i = 0; i < player.length; i++){
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
	}
}

