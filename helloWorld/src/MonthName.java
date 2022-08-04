import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program to give the month num and print the month name ----> by if else ladder
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the month number :");
		int month = input.nextInt();
		
//		if(month == 1)
//		{
//			System.out.println("January");
//		}
//		else if(month == 2)
//		{
//			System.out.println("feb");
//		}
//		else if(month == 3)
//		{
//			System.out.println("Mar");
//		}
//		else if(month == 4)
//		{
//			System.out.println("Apr");
//		}
//		else if(month == 5)
//		{
//			System.out.println("May");
//		}
//		else if(month == 6)
//		{
//			System.out.println("Jun");
//		}
//		else if(month == 7)
//		{
//			System.out.println("July");
//		}
//		else if(month == 8)
//		{
//			System.out.println("Aug");
//		}
//		else if(month == 9)
//		{
//			System.out.println("Sep");
//		}
//		else if(month == 10)
//		{
//			System.out.println("oct");
//		}
//		else if(month == 11)
//		{
//			System.out.println("Nov");
//		}
//		else if(month == 12)
//		{
//			System.out.println("Dec");
//		}
//		else
//		{
//			System.out.println("Invalid Input");
//		}
		
		switch(month)  
	    {  
	        case 1:   
	            System.out.println("Jan");  
	            break;  
	        case 2:   
	            System.out.println("feb");  
	            break;  
	        case 3:   
	            System.out.println("march");  
	            break;  
	        case 4:   
	            System.out.println("april");  
	            break;  
	        case 5:   
	            System.out.println("May");  
	            break;  
	        case 6:   
	            System.out.println("June");  
	            break;    
	        case 7:   
	            System.out.println("july");  
	            break; 
	        case 8:   
	            System.out.println("Aug");  
	            break; 
	        case 9:   
	            System.out.println("sept");  
	            break; 
	        case 10:   
	            System.out.println("oct");  
	            break; 
	        case 11:   
	            System.out.println("Nov");  
	            break; 
	        case 12:   
	            System.out.println("Dec");  
	            break; 
	        default:   
	            System.out.println("invalid input");  
	    }  

		  
	}

}
