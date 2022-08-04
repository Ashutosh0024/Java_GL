import java.util.*;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to vote system if age > 18 allow to cast Vote
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the age :");
		int age = input.nextInt();
		if(age >= 18)
		{
			System.out.println("you can cast the vote");
		}
		else
		{
			System.out.println("cannot cast the vote");
		}
		
		
		
		

	}

}
