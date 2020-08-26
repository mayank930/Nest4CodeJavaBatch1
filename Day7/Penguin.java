public class Penguin extends Bird implements SwimBehavior{
	 public void sound(){
	        System.out.println("Honking...");
    }
    public void nesting(){
	        System.out.println("Nesting...");       	
    }    
    @Override
    public void swim() {
    	System.out.println("Penguin can swim...");
    }
}