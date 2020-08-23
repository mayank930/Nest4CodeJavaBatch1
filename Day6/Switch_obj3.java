public class Switch_obj3 {
    public static void main(String[] args) {
     SwitchClass Switch_Obj3 =new SwitchClass();
     
     Switch_Obj3.type="Mechanical Switch";
     Switch_Obj3.model="Roma";
     Switch_Obj3.color="White";
     Switch_Obj3.pole="Single Pole Switch";
     Switch_Obj3.way= "Two Way Switch";
    System.out.println(Switch_Obj3.type);
    System.out.println(Switch_Obj3.model);
    System.out.println(Switch_Obj3.color);
    System.out.println(Switch_Obj3.pole);
    System.out.println(Switch_Obj3.way);

    Switch_Obj3.on();
    Switch_Obj3.off();
    Switch_Obj3.status();
    }
}