package codes;

/* Consider a class Parent which is extended by class Child. 
 * Class Parent contains a single float member 'height'.
 * Class Child contains a float member 'height', a constructor and 
   a member method show() which displays the values of member variable 'height' of class Parent and
   class Child respectively .

Complete the missing code to assign the values entered by the user to the member variable 'height' 
of the class Parent and child respectively. Display them using the show() method as shown below.

Enter the height of the Parent:
6.1
Enter the height of the Child:
6.3
Height of the Parent:6.1
Height of the Child:6.3
 */


import java.util.*;
class Parent{
    float height;
}

class Child extends Parent {
    float height;
    
    //Write the missing code 
    
   Child(){
        = num1;
        = num2;
   }
   
   void show()
   {
       System.out.println("Height of the Parent:"+);
       System.out.println("Height of the Child:"+);
   }
   
}

class testSuper{

 public static void main(String args[]){
 Scanner scanner=new Scanner(System.in);

 System.out.println("Enter the height of the Parent:");
 float num1=scanner.nextFloat();
 System.out.println("Enter the height of the Child:");
 float num2=scanner.nextFloat();
 Child obj = new Child(num1,num2);
 obj.show();
 scanner.close();
}

}

