package org.example;

public class Main {


    public static void main(String[] args) {
/*Premetive datatype*/

        byte by=127; //when you create a variable data type is must.With in the same variable we can not change thedat type. but you can change the value.
        by=100;
        //you can change the value and latest value will be count.

        System.out.println("The value of variable is : "+ by);//concatanation

        short sh=23456;
        System.out.println("The value of short variable is : "+ sh);

int i = 1234567890;//not more thn 10 digit
        System.out.println("The value of int variable is : "+ i);


        long l= 1234567890123l;
        System.out.println("The value of long variable is : "+ l);

        float f = 1234567890123f;
        System.out.println("The value of float variable is : "+ f);

        double d=123456789012d;
        System.out.println("The value of double variable is : "+ d);

        boolean bl= false;
        System.out.println("The value of boolean variable is : "+ bl);

        char ch= 'C';
        System.out.println("The value of char variable is : "+ ch);

        /*Non primitive data type*/
        String s="Masuma";//collection of characters with double quote
        System.out.println("The value of String variable is : "+ s);

        /*Arrays :
        Arrays in java is a homogeneous data structures implemented in java as Objects.Arrays store one or more values of a specific data type and provide indexed
        access to store the same A specific element in an arrays is accessed by its index.

        Classes : A class in java is a blueprint which includes all your data.A class contains fields(vaviables) and methods to describe the behavior of an object.

        Interface : Like a class, an interface can have methods and variables, but the methods declared in the interface are by default
        abstruct (onlt method signature,no body).
        */




    }
}