public class ConstructBird {
    public static void main(String[] args) {
        Bird obj1= new Penguin();
        obj1.eat();
        ((Penguin)obj1).eat("Fish");
        
        Bird obj2=new Parrot();
        obj2.eat();
        ((Parrot)obj2).eat("Fruit");

        Bird obj3=new Ostrich();
        obj3.eat();
        ((Ostrich)obj3).eat("Leaves");
    }
}
