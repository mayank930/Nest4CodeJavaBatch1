// Solve the Printing Mistakes
import java.util.Scanner;
public class Assignment_Day3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Word of 6 letters:");
		String String1 = scan.next();
		System.out.println("Enter Second Word of 6 letters:");
		String String2 = scan.next();
		
		String firsttwo = String1.substring(0,2);
		String rem_String1 = String1.substring(2,6);
		
		String lasttwo = String2.substring(4,6);
		String rem_String2 = String2.substring(0,4);
		
		String newString1=lasttwo+rem_String1;
		System.out.println(newString1);
		String newString2=rem_String2+firsttwo;
		System.out.println(newString2);
	}	
}
