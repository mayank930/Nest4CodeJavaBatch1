public class Ostrich extends Bird{
    @Override
    public void eat()  {
        System.out.println("Ostrich is Eating...");
    }    
    public void eat(String item) {
        System.out.println("Ostrich is Eating "+item);
    }
}