
public class LetterReverse {
    public static void main(String[] args) {
		String str = "Ashutosh";
		String newstr = " ";
		char ch;
		for (int i=0; i<str.length(); i++)
	      {
	        ch = str.charAt(i); //extracts each character from the string Ashutosh
	        newstr = ch + newstr; 
	      }
	  System.out.println(newstr);
	}
}


