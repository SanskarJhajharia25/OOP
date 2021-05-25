package codes;

abstract class Game{
	 
	public void play(){
		System.out.println("Game is being played");
	}
 
	abstract void noOfPlayers();
 
	public void winner(String name){
		System.out.println("Winner is : " + name);	
	}
}

class Cricket extends Game{
 
	public void noOfPlayers(){
		System.out.println("22");
	}
 
	public void teams(){
		System.out.println("2");	
	}
}

class Chess extends Game{
 
	public void noOfPlayers(){
		System.out.println("2");
	}
}
public class Downcasting {
	 public static void main(String a[]) {
	      Game G;
	      
	      G = new Cricket();         //Line 37
	      
	     /* Write code to invoke play() using G.
	      * Write code to invoke noOfPalyers() using G.
	      * Write code to invoke teams() using G.
	      * Write code to invoke winner() using G.
	      * 
	      * Note: Write not more than 4 lines of code for the tasks given above
	      * 
	      * How can you avoid ClassCastException, if, the code at line 37 is replaced as
	      *  G = new Chess(); Assume that the remaining portions of the code is not modified.
	      */
	  
	      
	     
	  }

}
