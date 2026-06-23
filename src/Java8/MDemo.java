package Java8;

import java.util.Optional;

public class MDemo {

    public void demo(){
      //  L14_Vehicle v = new L14_Vehicle();
      //  v.satrt();

       // L15_Bike b = new L15_Bike();
      //  b.satrt();

        /*

        L14_Vehicle v = new L14_Vehicle() {
            @Override
            public void satrt() {
                System.out.println("Vehicle Engine Started Lambda Ananymous Class ");
            }
        };
       v.satrt();

         */


//        L14_Vehicle v = () -> {
//            System.out.println("Vehcile Engine Started Lambda ");
//        };
//        v.satrt();


//       L14_Vehicle v1 = () -> System.out.println("Vehcile Engine Started Lambda ");
//       v.satrt();



//        L18_Calclutor c = (a, b) -> {
//          return   a + b;
//        };
//        System.out.println( c.sum(8, 12));


//        L18_Calclutor c = (a, b) -> a + b;
//        System.out.println( c.sum(8, 12));

    }

    public void demo2(){

//        L19_MyInterface1 obj1 = () -> L21_Greeting.greet();
//        obj1.print();


//        L19_MyInterface1 obj2 = L21_Greeting::greet;
//        obj2.print();

//        L20_MyInterface2 obj1 = (a, b) -> L22_MyUtilClass.add(a,b);
//        System.out.println(  obj1.sum2(32,18));


//        L20_MyInterface2 obj2 = L22_MyUtilClass::add;
//        System.out.println(obj2.sum2(60,40));
    }


    public void demo3(){
        Optional<L23_User> user = L24_UserService.getUser(1);

      user.ifPresent((u) -> System.out.println(u.getName()));
    }




}
