package com.oops;
//The super keyword in Java is a reference variable which is used to refer immediate parent class object.
//Usage of Java super Keyword:0
//1.super can be used to refer immediate parent class instance variable.
//2.super can be used to invoke immediate parent class method.
//3.super() can be used to invoke immediate parent class constructor.
class NewBase{
	String color = "White";
	void show()
	{
		System.out.println("Base class color is " + " " + color);
	}
	
}

class NewChild extends NewBase{
	String color = "Red";
	void show()
	{
		super.show();
		System.out.println("Child class color is " + " " + color);
		System.out.println("Base class color is " + " " + super.color);
	}
}
public class SuperKeyword {

	public static void main(String[] args) {
		NewChild obj = new NewChild();
		System.out.println(obj.color);
		obj.show();
		

	}

}
