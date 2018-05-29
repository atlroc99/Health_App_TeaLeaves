package com.test.tea.leaves;

public class Cat extends Pet{

	public Cat(String name) {
		super(name);
		System.out.println("inside the cat constructor");
	}

	@Override
	public String speak() {
		return "Meaw..meaw";
	}
}