package com.oops;
//Why use Java interface?
//There are mainly three reasons to use interface. They are given below:
//1.It is used to achieve abstraction.
//2.By interface, we can support the functionality of multiple inheritance.
//3.It can be used to achieve loose coupling.

interface Info{
	
	void show(int id , String name);
}

class Childinfo implements Info
{
	public void show(int id , String name)
	{
		System.out.println("ID:" + " " + id);
		System.out.println("Name:" + " " + name);
	}
}
public class Interfaces {
	public static void main(String[] args) {
		Childinfo obj = new Childinfo();
		obj.show(21, "Ashutosh");
	}

}
