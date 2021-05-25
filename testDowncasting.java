package codes;

abstract class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Woof!");
    }
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
 
class Cat extends Animal {
    public void meow() {
        System.out.println("Meow!");
    }
}

class AnimalTrainer {
    public void teach(Animal anim) {
        anim.eat();
        
        if (anim instanceof Dog) {
        Dog d = (Dog) anim;   //Downcasting
        d.bark();}
        else if(anim instanceof Cat) {
        	Cat c = (Cat)anim;
        	c.meow();
        }
        
    }
}

public class testDowncasting {
	public static void main(String args[]) {
		
		//Dog dog = new Dog();
		Cat cat = new Cat();
		
		AnimalTrainer trainer = new AnimalTrainer();
		trainer.teach(cat);
	}

}
