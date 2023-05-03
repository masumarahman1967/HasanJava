package Java_Basic;

public class ConstructorDemo {
/*1.constructor name must be as classname
  2.no return type..void/public/static/private
  3.We can declare/assign only to the class vriable...if-else/no for loop
 */
   int x,y;
   String  z;

   void displayy(){
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
       System.out.println("Roll no is  "+x+" and name is   "+z);
   }
   /*
    ConstructorDemo(){
    x=100;
    y=200;
    z="Welcome";
    }*/
    ConstructorDemo(int a,String name){
       x=a;
       z=name;

    }
   /* ConstructorDemo(){

    }
    ConstructorDemo(){

    }
    ConstructorDemo(){

    }*/
}
