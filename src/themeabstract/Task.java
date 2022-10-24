import java.util.*;

public class Task {
    public static void main(String[]args) {
        List <Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog());
		animals.add(new Cat());
		animals.add(new Hamster());
		animals.add(new Parrot());
		animals.add(new Dog());
		
		for(Animal an : animals)
			an.say();
    }
}
class Animal {
    void say() {
        System.out.println("awh like animal");
    }
}
class Dog extends Animal {
	void say() {
    System.out.println("awh like dog");
	}
}
class Cat extends Animal {
	void say() {
    System.out.println("maeow like cat");
	}
}
class Parrot extends Animal {
	void say() {
    System.out.println("kiki like parrot");
	}
}
class Hamster extends Animal {
	void say() {
    System.out.println("shhhhhh like hamster");
	}
}
