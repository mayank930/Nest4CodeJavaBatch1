public class ConstructBird {
    public static void main(String[] args) {
        Parrot obj1= new Parrot();
        obj1.eat();
        obj1.layeggs();
        obj1.sound();
        obj1.nesting();
        obj1.fly();

        Penguin obj2=new Penguin();
        obj2.eat();
        obj2.layeggs();
        obj2.sound();
        obj2.nesting();
        obj2.swim();
        
        Ostrich obj3=new Ostrich();
        obj3.eat();
        obj3.layeggs();
        obj3.sound();
        obj3.nesting();
    }
}