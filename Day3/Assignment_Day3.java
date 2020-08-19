// Solve the Printing Mistakes
import java.util.Scanner;
public class Assignment_Day3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String:");
		String String1 = scan.next();
		System.out.println("Enter Second String:");
		String String2 = scan.next();
		
		String firsttwo1 = String1.substring(0,2);
		String lasttwo1= String1.substring(String1.length()-2,String1.length());
		String rem_String1 = String1.substring(2,String1.length()-2);
		
		String firsttwo2 = String2.substring(0,2);
		String lasttwo2= String2.substring(String2.length()-2,String2.length());
		String rem_String2 = String2.substring(2,String2.length()-2);
		
		String newString1=lasttwo2+rem_String1+firsttwo2;
		System.out.println(newString1);
		String newString2=lasttwo1+rem_String2+firsttwo1;
		System.out.println(newString2);
	}	
}
