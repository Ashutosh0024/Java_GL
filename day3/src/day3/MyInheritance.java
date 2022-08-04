package day3;

//single level inheritance
class Human
{  
	void eat(){
		System.out.println("eating...");
	}  
}  

class Ashutosh extends Human
{  
	void task(){
		System.out.println("coding.....");
	}  
}  
public class MyInheritance {
	public static void main(String[] args) {
		Ashutosh d = new Ashutosh();  
		d.task();  
		d.eat();  
	}

}


//final keyword:
//	if it will used with class then class become the final and you cannot extends the class.


//when final is used with variable then the value become final