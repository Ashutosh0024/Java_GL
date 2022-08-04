package com.oops;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
class Person
{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
}

public class MyAbstraction {
	public static void main(String[] args) {
		List<Person> p1 = new ArrayList<>();
		p1.add(new Person("Ashutosh" , 21));
		p1.add(new Person("Ankush" , 20));
		p1.add(new Person("Amit" , 22));
		p1.add(new Person("rohit" , 20));
		
		for(int i = 0 ; i < p1.size(); i++)
		{
			System.out.println(p1.get(i));
		}
	}
	

}
