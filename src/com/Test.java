package com;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Animal<Integer> a = new Animal<Integer>(10);
		System.out.println(a.display());
		
		Animal<String> s = new Animal<String>("delhi");
		System.out.println(s.display());
		
		Animal<Float> f = new Animal<Float>(10f);
		System.out.println(f.display());
		
		Dog dog = new Dog('a');
		
		Animal<Dog> d = new Animal<Dog>(dog);
		Dog dog1 = d.display();
		System.out.println(dog1.show());
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("delhi");
		arr.add("manali");
		arr.add("pune");
		arr.add("kolkata");
		
		
		
		Animal<ArrayList<String>> al = new Animal<ArrayList<String>>(arr);
		ArrayList<String> arrlist = al.display();
//		arrlist.get(0);
//		arrlist.get(1);
//		arrlist.get(2);
//		arrlist.get(3);
		System.out.println(arrlist);

		
		

	}

}
