package com.oops;

//Parent Class
class Vehicle{
	String brand = "Maruti";
	void type()
	{
		System.out.println("Four Wheeler");
	}
	
}

//child class
class Car extends Vehicle{
	String CarName = "Swift Desire";
}
public class SingleInheritance {
	public static void main(String[] args) {
		Car v1 = new Car();
		v1.type();
		System.out.println(v1.CarName);
		System.out.println(v1.brand);
		
		

	}

}
