public class Switch_Obj2 {
 public static void main(String[] args) {
    SwitchClass Switch_Obj2 =new SwitchClass();
     
    Switch_Obj2.type="Mechanical Switch";
    Switch_Obj2.model="Anchor";
    Switch_Obj2.color="Grey";
    Switch_Obj2.pole="Single Pole Switch";
    Switch_Obj2.way= "One Way Switch";
   System.out.println(Switch_Obj2.type);
   System.out.println(Switch_Obj2.model);
   System.out.println(Switch_Obj2.color);
   System.out.println(Switch_Obj2.pole);
   System.out.println(Switch_Obj2.way);

   Switch_Obj2.on();
   Switch_Obj2.off();
   Switch_Obj2.status();
 }   
}