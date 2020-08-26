
public abstract class Bird {
    
    int weight;
    int height;
    String beakShape;
    String color;
    
    public void eat(){
        System.out.println("Eating...");
    }
    public void layeggs(){
        System.out.println("Laying Eggs...");
    }
    
    public abstract void sound();
    public abstract void nesting();

}