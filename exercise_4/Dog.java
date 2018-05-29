package com.test.tea.leaves;

public class Dog extends Pet{

	public Dog(String name) {
		super(name);
		System.out.println("inside the Dog constructor");
	}

	@Override
	public String speak() {
		return "Woof Woof";
		
	}
}