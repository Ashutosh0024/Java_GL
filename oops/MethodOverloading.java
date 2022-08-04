package com.oops;

//Method overloading : Method which have same name but differ in number of parameters.
class Addition{
	public int add(int a , int b){
		return (a + b );
	}
	public int add(int a , int b , int c){
		return (a + b + c);
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Addition ad = new Addition();
		System.out.println(ad.add(21, 31));
		System.out.println(ad.add(21, 21 , 21));

	}

}
