package com.polymorphism.override;

public class Dog extends Animal {
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
}
