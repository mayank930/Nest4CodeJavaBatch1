
public class Calculate_Restaurant_Bill {
	public static void main(String[] args) {
		float price1=70,price2=20,price3=10;
		float pdt_price=price1+price2+price3;
		float tax_per=18;
		float tax_amt= (tax_per*pdt_price)/100;
		float Final_amt=pdt_price+tax_amt;
		System.out.println(Final_amt);
	}
}
