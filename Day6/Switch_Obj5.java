public class Switch_Obj5 {
    public static void main(String[] args) {
        SwitchClass Switch_Obj1 =new SwitchClass();
        
        Switch_Obj1.type="Mechanical Switch";
        Switch_Obj1.model="Havells DPDT";
        Switch_Obj1.color="White";
        Switch_Obj1.pole="Double Pole Switch";
        Switch_Obj1.way= "Two Way Switch";
       System.out.println(Switch_Obj1.type);
       System.out.println(Switch_Obj1.model);
       System.out.println(Switch_Obj1.color);
       System.out.println(Switch_Obj1.pole);
       System.out.println(Switch_Obj1.way);
   
       Switch_Obj1.on();
       Switch_Obj1.off();
       Switch_Obj1.status();
   
    }    
}