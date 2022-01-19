package com;

public class Animal<T> {
	
	T ob;
	
	public Animal(T ob) {
		this.ob=ob;
	}
	
	public T display() {
		return ob;
	}

}
