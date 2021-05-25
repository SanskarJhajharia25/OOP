/*
 * The generic Sports class has no. of players, n, getName() and getNumber() as its 
 * data members. Let a Soccer class extend the Sports super class. The implementation 
 * for the Sports class is provided to you. Write appropriate constructor and 
 * overridden methods for the Soccer class. 

Expected Output:

Generic Sports
No. of players in Generic Sports team is: 
Soccer Sports
No. of players in Soccer Sports team is: 11
 */
		

class Sports{
    int n;
    
    Sports(int n){
    	this.n = n;
    }
    String getName(){
        return "Generic Sports";
    }
	
//	abstract String getName();
  
    String getNumber(){
        return "No. of players in "+getName() + " team is: ";
    }
}

//class Soccer extends Sports{
//	
//	Soccer(int n){
//	}
//	
//    @Override
//    String getName(){
//    	return ;
//    }
//
//    // Write your overridden getNumberOfTeamMembers method here
//    String getNumber(){
//        return ;
//    }
//
//}

public class testOverriding{
	
    public static void main(String []args){
        Sports c1 = new Sports(0);
        System.out.println(c1.getName());
        System.out.println(c1.getNumber());
        
//        Soccer c2 = new Soccer(11);
//        System.out.println(c2.getName());
//        System.out.println(c2.getNumber());
	}
}
