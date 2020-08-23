public class SwitchCons {
    String type;
    String model;
    String color;
    String pole;
    String way;
    public void display(){
    System.out.println(type);
    System.out.println(model);
    System.out.println(color);
    System.out.println(pole);
    System.out.println(way);

    }
    //Constructor
    public SwitchCons(String t,String m,String c,String p ,String w){
        type=t;
        model=m;
        color=c;
        pole=p;
        way=w;
    }

}