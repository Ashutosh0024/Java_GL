package com.oops;
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//Points to Remember:
//1.An abstract class must be declared with an abstract keyword.
//2.It can have abstract and non-abstract methods.
//3.It cannot be instantiated.
//4.It can have constructors and static methods also.
//5.It can have final methods which will force the subclass not to change the body of the method.
abstract class InfoBase{
	int id;
	String name;
	abstract void showDetails(int id , String name);

}

class InfoChild extends InfoBase{
	void showDetails(int id , String name)
	{
		System.out.println("ID" + " " + id);
		System.out.println("Name" + " " + name);
	}
}
public class AbstractMethod {
	public static void main(String[] args) {
		InfoChild obj = new InfoChild();
		obj.showDetails(01, "Ashutosh");

	}

}
