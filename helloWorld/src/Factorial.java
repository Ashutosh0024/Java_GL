
public class Factorial {

	public static void main(String[] args) 
	{
		int num = 6, fact = 1;
	    if(num < 0)
	        System.out.println("Not Possible");
	    else
	    {
	        for(int i = 1; i <= num; i++)
	            fact = fact * i;
	    }
	    System.out.println("Fact "+ num + ": " + fact);
	}

}


