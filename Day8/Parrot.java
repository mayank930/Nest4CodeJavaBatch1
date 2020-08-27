public class Parrot extends Bird{
    @Override
    public void eat()  {
        System.out.println("Parrot is Eating...");
    }    
    public void eat(String item) {
        System.out.println("Parrot is Eating "+item);
    }
}