package com.polymorphism.override;

public class Main {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog();

		// Calling makeSound method on instances
		animal.makeSound(); // Output: Animal makes a sound
		dog.makeSound(); // Output: Dog barks
	}
}
