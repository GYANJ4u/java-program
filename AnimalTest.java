// Define the interface
interface Animal {
    void makeSound();
}

// Dog class implementing Animal interface
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Cat class implementing Animal interface
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow Meow!");
    }
}

// Main class to test the implementation
public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
}

