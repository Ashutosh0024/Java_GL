package com.oops;

class MyDetails
{
	int id;
	String name;
	int age;
	
	//constructor Overloading.
	public MyDetails(int id, String name , int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public MyDetails(int id , String name)
	{
		this.name = name;
		this.id = id;
	}
	
}
public class Constructor {

	public static void main(String[] args) {
		MyDetails detail = new MyDetails(2 , "Ashutosh");
		System.out.println("id:" +detail.id);
		System.out.println("Name:" +detail.name);
		
	  

	}

}
