public class Penguin extends Bird{
    @Override
    public void eat()  {
        System.out.println("Penguin is Eating...");
    }    
    public void eat(String item) {
        System.out.println("Pengiun is Eating "+item);
    }
}