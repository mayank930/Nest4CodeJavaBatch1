// Height and Weight Converter //
public class Assignment_Day2 {
	// 1-Height Converter, 1 feet=12inch , 1 inch=2.54cm//
	static float HeightConverter (int heightfeetpart, int heightinchpart) {
		float heightconv= (heightfeetpart*12+heightinchpart)*(float)2.54 ;
		return heightconv;
	}
	//2-Weight Converter, 1 Kg=2.2pounds//
	static float WeightConverter(int weight) {
		float weightconv=weight*(float)2.2;
		return weightconv;
	}
	
	public static void main(String[] args) {
        // sample I/P O/P 1// 
		int ft=5,inch=11;
		float result= HeightConverter(ft,inch);
		System.out.println("Height in cm is "+result);
		
		int weightkg=60;
		float weightresult= WeightConverter(weightkg);
		System.out.println("Weight in pounds is "+weightresult);
		
		// sample I/P O/P 2//
		int ft_=5,inch_=0;
		float result_= HeightConverter(ft_,inch_);
		System.out.println("Height in cm is "+result_);
		
		int weightkg_=101;
		float weightresult_= WeightConverter(weightkg_);
		System.out.println("Weight in pounds is "+weightresult_);
		
	}
}
