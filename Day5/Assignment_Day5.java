//Half Diamond Pattern
import java.util.Scanner;
public class Assignment_Day5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
		for(int k=1;k<num;k++) {
			for(int l=num;l>k;l--) {
				System.out.print("*");
			}
			System.out.println(); 
		}
	}
}
