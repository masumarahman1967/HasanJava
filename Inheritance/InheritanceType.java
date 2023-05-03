package Inheritance;

class A{
    int a=100;
    void display(){
        System.out.println(a);
    }
}
class B extends A {
    int b=200;

    void show(){
        System.out.println(b);
    }
}

class C extends B {
    int z=300;
    void printing(){
        System.out.print(z);
    }
}

public class InheritanceType {

    public static void main(String []args){

       B rb= new B();
        System.out.println(rb.a);
        System.out.println(rb.b);
        rb.show();
        rb.display();

        C cb= new C();
        System.out.println(cb.z);

        rb.show();
        rb.display();
        rb.notify();
        cb.toString();
    }
}
