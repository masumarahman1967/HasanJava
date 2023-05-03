package Inheritance;
class Parent{
    void display(int b){
        System.out.println(b);
}}

    class Child01 extends Parent {
        void display(int c) {
            System.out.println(c);
        }
    }
        class child02 extends Parent {
            void display(int a) {
                System.out.println(a);
            }
        }

public class ParentInheritance {

    public static void main(String[] args) {
        Child01 child01=new Child01();
        child01.display(5);
    }


    }

