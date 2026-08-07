package org.example.oops;

// Inheritance - Cat extends Animal
public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    // Polymorphism - overriding makeSound
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    public void purr() {
        System.out.println(getName() + " is purring");
    }
}
