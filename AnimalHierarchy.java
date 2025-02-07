class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Chirping");
    }
}

public class AnimalHierarchy {
    public static void main(String args[]) {
		Animal animal=new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

		animal.makeSound();//Outputs: Sound
        dog.makeSound(); // Outputs: Barking
        cat.makeSound(); // Outputs: Meow
        bird.makeSound(); // Outputs: Chirping
    }
}
