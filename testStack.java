package codes;


class MyStack {
	 
    private int stackSize;
    private Object[] stackArr;
    private int top;
     
    public MyStack(int size) {
        this.stackSize = size;
        this.stackArr = new Object[stackSize];
        this.top = -1;
    }
 
    public void push(Object entry){
        if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+entry);
        this.stackArr[++top] = entry;
    }
 
    public Object pop() {
        if(this.isStackEmpty()){
            System.out.println("Stack is empty. Can not remove element.");
            return null;
        }
        Object entry = this.stackArr[top--];
        System.out.println("Removed entry: "+entry);
        return entry;
    }
     
   
 
    private void increaseStackCapacity(){
         
      Object[] newStack = new Object[this.stackSize*2];
        for(int i=0;i<stackSize;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.stackSize = this.stackSize*2;
    }
     
    public boolean isStackEmpty() {
        return (top == -1);
    }
 
    public boolean isStackFull() {
        return (top == stackSize - 1);
    }
     
   
}
public class testStack {
	 public static void main(String a[]){
	        MyStack stringStack = new MyStack(2);
	        stringStack.push("A");
	        stringStack.push("B");
	        MyStack integerStack = new MyStack(2);
	        integerStack.push(2);
	        integerStack.push(3);
	    }
}
