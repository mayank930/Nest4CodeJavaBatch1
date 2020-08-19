import java.util.Scanner;
public class Assignment_Day4 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Number:");
		long num = scan.nextLong();
		if(num<0)
			num= -(num);
		int evencount=0,oddcount=0;
		while(num>0) {
			long digit=num%2;
			if(digit%2==0)
				evencount++;
			else
				oddcount++;
			num/=10;
		}
		System.out.println("even digits are "+evencount);
		System.out.println("odd digits are "+oddcount);
	}
}
