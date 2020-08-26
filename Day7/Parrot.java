public class Parrot extends Bird implements FlyBehavior{
    public void sound(){
        System.out.println("Chirping...");
    }
    public void nesting(){
        System.out.println("Nesting...");
    }
    @Override
    public void fly() {
        System.out.println("Parrot can fly...");
    }
}