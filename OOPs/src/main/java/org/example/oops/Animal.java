package org.example.oops;

// Encapsulation - fields are private, accessed via getters/setters
public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    // Polymorphism - overridden by subclasses
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}
