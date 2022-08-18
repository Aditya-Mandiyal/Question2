package com.godigit.ques2;

public class Trainer {

	private String name;
	private int yearOfExp;
	public Trainer(String name, int yearOfExp) {
		super();
		this.name = name;
		this.yearOfExp = yearOfExp;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", yearOfExp=" + yearOfExp + "]";
	}
	
	
}
