package com.oops;
class Student 
{
	String name;  //defining fields  
	int age;
	int id;
	
	
//	constructor
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}


//    method
	public void print()
	{
		System.out.println("Name:" + " " + name);
		System.out.println("Age:" + " " + age);
		System.out.println("id:" + " " + id);
	}
}
public class ClassesAndObject {

	public static void main(String[] args) {
		
		//creating an objects of Student 
		Student s1 = new Student("Ashutosh"  , 21 , 01);
		Student s2 = new Student("Ankush"  , 22 , 02);
		Student s3 = new Student("Amit"  , 21 , 03);
		Student s4 = new Student("Rohit"  , 21 , 04);
		Student s5 = new Student("Sachin"  , 21 , 05);
		
		
		s1.print();
		s2.print();
		s3.print();
		s4.print();
		s5.print();
		
		

	}

}
