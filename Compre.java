/***************************************************************************************************
 ******************************** CSF213 OBJECT ORIENTED PROGRAMMING *******************************
 ********************************             PART A                 *******************************
 ********************************        MAX. MARKS: 30              *******************************
 ********************************     MAX. DURATION: 50 min          *******************************
 **************************************************************************************************/
// Name: 
// ID: 
import java.util.*;
import java.util.function.*;
import java.io.*;
/*****************************************IMPORTANT INSTRUCTIONS************************************
 * Write your Name and ID Number before solving the questions.
 * Refactor the file as PartA_ID_Number, eg. PartA_2018A7PS001P
 * There are 9 questions written within 9 methods.
 * Before each static method, problem statement and expected output are mentioned in a comment section.
 * You are not allowed to do the following:
  		-> Modify the main() method.
  		-> Break the single java file into multiple files containing separate class definitions.
 	    -> Modify the code of any class/method if it is mentioned explicitly.
 	    -> Modify the signature of any method.
 	    -> Import any new classes or packages in your solution.
 	    -> Create new methods with overridden methods as an exception.
 	    -> Declare new instance/local variables.
 	    -> Create new classes in your solution with anonymous class as an exception.
 	    -> Include additional statements in any class/method unless it is mentioned explicitly

EVALUATION SCHEME IS BINARY. BUT A PENALTY WILL BE IMPOSED THOUGH THE DESIRED OUTPUT IS OBTAINED
BUT THE GIVEN CONSTRAINTS ARE NOT MET. PENALTY WILL VARY BASED ON THE TYPE OF VIOLATION.
 ********************************DON'T MODIFY THIS SECTION*****************************************/
class ComprePartAQP {
	public static void main(String []args) {
		System.out.print("Answer 1: ");
		ques1();
		System.out.print("Answer 2: ");
		ques2();
		System.out.print("Answer 3: ");
		ques3();
		System.out.print("Answer 4: ");
		ques4();
		System.out.print("Answer 5: ");
		ques5();
		System.out.print("Answer 6: ");
		ques6();
		System.out.print("Answer 7: ");
		ques7();
		System.out.print("Answer 8: ");
		ques8();
		System.out.print("Answer 9: ");
		ques9();
	}

	/***********************************************************************************************
	 * Question 1: Modify only the Child class to get the desired output. The generic child class 
	 * must accept the following types only:
	 *     CharBuffer, Segment, String, StringBuffer, StringBuilder
	  
	 * Expected output:
	   Parent called

	   														         [Binary Marking: 3 or 0 marks]
	 **********************************************************************************************/
	static void ques1() {
		/*
		 * Don't modify the generic class Parent
		 */
		class Parent<T> {
			protected T var; 
			void set(T t){
				var = t;
				System.out.println("Parent "+var);
			}
		}
		class Child<S extends CharSequence> extends Parent<String>{
			void set(S s){
				var =(String)s;
				System.out.println("Child "+var);
			}
			/*
			 * Don't modify this method
			 */
			void testQ1() {
				Parent<String> err; 
				err = new Child<String>(); 
				err.set("called");
			}
		}
		new Child().testQ1();  
	}

	/***********************************************************************************************
	 * Question 2: Modify the following code to print the longest string first and so on.
	 	  
	 * Expected output:
	   [Bangalore, Chennai, Kolkata, Delhi]
	  	   
	    															  [Binary Marking: 3 or 0 marks]
	 **********************************************************************************************/
	static void ques2() {
		String[] str = {"Delhi", "Bangalore", "Chennai", "Kolkata"}; //Don't modify this line
		Arrays.sort(str, new Comparator<String>(){
			public int compare(String a, String b) {
				return b.length()-a.length();
			}
		});  
		System.out.println(str);
	}
	/***********************************************************************************************
	 * Question 3: Modify the following code to get the desired output.
	 
	 * Expected Output:
		30	20
		
		   															  [Binary Marking: 3 or 0 marks]
	 **********************************************************************************************/
	static void ques3() {
		/*
		 * Don't modify the class A and class B.
		 * Only class C can be modified to generate the desired output.
		 */
		class A {final int i = 10; }
		class B extends A {final int i = 20; int func() { return i; }  }
		class C extends B {final int i = 30; int func( ) { return i; }  

		void testQues3() {
			A o1; B o2;
			o1 = new C( );
			o2 = (B) o1;
			System.out.println(o2.func( )+" "+o2.i);
		}
		}
		new C().testQues3();
	}

	/***********************************************************************************************
	 * Question 4: Modify only print statements to get the desired output. Each print statement should
	 * contain one alphabet only.
	 
	 * Expected output:
	   ABCDEF
	   
	 	   															  [Binary Marking: 4 or 0 marks]  
	 **********************************************************************************************/
	static void ques4() {
		class Ques4{
			public void fun1() {
				try {
					fun2();
				}finally {
					System.out.print("D");
				}	
			}
			public void fun2() {
				try{
					System.out.print("B");
					Object x = null;
					x.toString(); }
				finally {
					System.out.print("C");}
			}
		}
		System.out.print("A");
		try {
			new Ques4().fun1();}
		catch(Exception e) {
			System.out.print("E"); }
		System.out.println("F");
	}

	/***********************************************************************************************
	 * Question 5: Using the functional interface "Predicate" in java.util.functions.*, write Lambda
	 * expression to check if the customer has a minimum balance of Rs. 5000. It should print true, 
	 * if yes or false, if the conditions fails. 
	
	 * Expected output:
	   True
	   
	   NOTE: You are allowed to modify the signature of check() method and its corresponding function
	         call. 
	         
	 	   															  [Binary Marking: 4 or 0 marks]        
	 **********************************************************************************************/

	static void ques5() {
		class Acc{
			float balance;
			
			private void check(Acc a, Predicate<Acc> pred) {
				System.out.println(pred.test(a) ? "True" : "False");
			}
			
			void testQues5() {
				Acc a = new Acc();
				a.balance = 5001;
				check(a, p -> p.balance >= 5000);	
			}
		}
		new Acc().testQues5();
	}

	/***********************************************************************************************
	 * Question 6: Make the necessary changes to get the desired output.
	 * Use appropriate Collection class only.
	 *  
	 * Expected output:
	   [A, B, C]
	   
	 	   															  [Binary Marking: 4 or 0 marks]  
	 **********************************************************************************************/

	static void ques6() {
		class Ques6{
			private <T extends Set<U>,U> U append(T list, U element) {
				list.add(element);
				return element;		
			} 		
			void testQues6() {
				Set<String> val = new HashSet<>();
				append(val,"B");
				append(val,"A");
				append(val,"C");
				append(val,"A");
				System.out.println(val);
			}
		}
		new Ques6().testQues6();
	}

	/***********************************************************************************************
	 * Question 7: Modify the code to get the desired output. 
	 
	 * Expected output:
	   madam Equal

	   NOTE: Don't modify the == operator at Line7A. 
	         Don't modify the signatures of the method/constructor.
			 Additional statements are allowed at Line7B.
	   	   															  [Binary Marking: 3 or 0 marks]
	 **********************************************************************************************/
	static void ques7() {
		class Ques7{
			private String s = "madam";
			public Ques7() {
				System.out.print(new StringBuffer(s).reverse()+" ");  //uncomment this line to complete this question
			}
			public void Ques7() {
				if( s == "madam") //Line7A
					System.out.println( "Equal" );
				else System.out.println( "Not Equal" );
			}
		}
		//insert not more than two lines of code to get the desired output.   //Line7B
		new Ques7().Ques7();
	}
	/***********************************************************************************************
	 * Question 8: Uncomment the code to fill in the blanks such that the byte array is converted 
	 * into upper case and the first 4 characters are written on to the file "file.txt". 
	 * 
	 * Also, fill in the blanks to read the file "file.txt" and print its content on the 
	 * console.
	 * 
	 * Expected output:
	   JAVA
	 
	 	   	   															  [Binary Marking: 3 or 0 marks]
	 **********************************************************************************************/
	static void ques8() {
		File f = new File("file.txt");
		try(FileWriter os = new FileWriter(f)){
			byte[] data = {'j','a','v','a','9'};
			os.write(new String(data).toUpperCase(),0,4);
		}catch(Exception e) {}
		
		try(InputStream is = new FileInputStream(f)){
			System.out.println(new String(is.readAllBytes()));
		}catch(Exception e) {}
	}

	/***********************************************************************************************
	 * Question 9: Separate the input using the Scanner class method and get the desired output
	 *  
	 * Expected output:
	   +91-77777-68999
	 
	 NOTE: Additional statement is allowed at Line9A.
	       You are allowed to write additional statements to handle exceptions, if any.
	       But you are not allowed to modify the existing code.
	 
	   	   															  [Binary Marking: 3 or 0 marks]
	 **********************************************************************************************/
	static void ques9() {
		String in = "+91, 77777 68999";                  //don't modify this line
		Scanner sc = new Scanner(in);
		// insert not more than one line of code        //Line9A
		sc.useDelimiter(", | ");
		 try {
			 while(sc.hasNext())
				 System.out.print("+"+sc.nextShort());
		 }catch(Exception e) {
			 while(sc.hasNext())
				 System.out.print("-"+sc.nextInt());
		 }
		 sc.close();
	}
}
/*******************************************END*****************************************************/
