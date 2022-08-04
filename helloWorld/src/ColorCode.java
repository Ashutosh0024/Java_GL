import java.util.*;
public class ColorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to give color code and print the color name ----> by if else ladder
		System.out.println("white-1");
		System.out.println("black-2");
		System.out.println("red-3");
		System.out.println("blue-4");
		System.out.println("-------------------------");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the color code :");
		int code = input.nextInt();
		
//	    if(code == 1)
//	    {
//	    	System.out.println("white");
//	    }
//	    else if(code == 2)
//	    {
//	    	System.out.println("Black");
//	    }
//	    else if(code == 3)
//	    {
//	    	System.out.println("Red");
//	    }
//	    else if(code == 4)
//	    {
//	    	System.out.println("blue");
//	    }
//	    else
//	    {
//	    	System.out.println("invalid value");
//	    }
		
		//By switch Statement
		switch(code)  
	    {  
	        case 1:   
	            System.out.println("white");  
	            break;  
	        case 2:   
	            System.out.println("black");  
	            break;  
	        case 3:   
	            System.out.println("red");  
	            break;  
	        case 4:   
	            System.out.println("blue");  
	            break;  
	        default:   
	            System.out.println("invalid input");  
	    }  

	}

}
