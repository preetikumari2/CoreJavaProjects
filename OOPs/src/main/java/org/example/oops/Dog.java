package org.example.oops;

// Inheritance - Dog extends Animal
public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    // Polymorphism - overriding makeSound
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " is fetching the ball");
    }
}
