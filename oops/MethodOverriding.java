package com.oops;
//if subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
//Rules for Java Method Overriding
//1.The method must have the same name as in the parent class
//2.The method must have the same parameter as in the parent class.
//3.There must be an IS-A relationship (inheritance).
class Base
{
	void show(){
		System.out.println("this is base class show method");
	}
}

class Child extends Base
{
	
	void show()
	{
//		super.show();
		System.out.println("this is Child class show method");
	}


}
public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		Child obj = new Child();
		obj.show();
		

	}

}

