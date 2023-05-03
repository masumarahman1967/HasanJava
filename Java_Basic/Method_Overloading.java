package Java_Basic;

public class Method_Overloading {
/* Oops Concept:
Class
Object
Inheritance
Polymorphism
Abstraction
Encapsulation
 */

   /* Polymorphism:  Polymorphism can be achieved by method overloading and method overriding
    add(10,20);
    add(10,20,30);
    add(10,20,30,40);
    add(10,20,30,40,50);
   Question: Users can add number as they need
  add(add parameter as mutch as needed) <.....30000000.00.....>(add two parameters)
   300.0000
*/
    /*We can not declare variable as match as we want.It takes space in java memory.script will be heavy and will take time.
     we can not use local variable outside method--for different method diff variable not good practice

     */
    /* Method Overloading Rules:
    Method name must be same
    Numbers of parameters must be different(if parameter same)
    main method e call krar somoy parameter e value deta hobey

     */

    /*
    QWE123532....String
    H4321..character
     */
    int x,y;
    double d;//Instance variable

    void sum(){
        x=10;
        y=20;
        System.out.println(x+y);
    }

    void sum(int a,int b){
    x=a;
    y=b;
        System.out.println(x+y);
    }

    void sum(int a,double b){
     x=a;
     d=b;
        System.out.println(x+d);
    }
    void sum(double b,int a){
        d=b;
        x=a;
        System.out.println(d+a);
    }
    void sum(double b,int a,int c){
        d=b;
        x=c;
        System.out.println(d/c);
    }
    void sum(int b,int c,double a){
        y=b;
        x=c;
        System.out.println(x/y);
    }
}
