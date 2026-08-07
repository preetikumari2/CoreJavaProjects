package org.example.oops;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Inheritance & Encapsulation ===");
        Dog dog = new Dog("Buddy", 3);
        dog.eat();           // inherited from Animal
        dog.makeSound();     // overridden in Dog
        dog.fetch();         // Dog's own method
        System.out.println(dog.getName() + " is " + dog.getAge() + " years old");

        System.out.println();

        System.out.println("=== Polymorphism ===");
        Cat cat = new Cat("Whiskers", 2);
        cat.eat();           // inherited from Animal
        cat.makeSound();     // overridden in Cat
        cat.purr();          // Cat's own method

        System.out.println();

        // Polymorphism - Animal reference pointing to Dog and Cat objects
        System.out.println("=== Runtime Polymorphism ===");
        Animal[] animals = { new Dog("Rex", 5), new Cat("Luna", 1) };
        for (Animal animal : animals) {
            animal.makeSound(); // calls Dog or Cat version at runtime
        }
    }
}
