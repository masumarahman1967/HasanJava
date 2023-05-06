package Java_Basic;

public class Main {
    public static void main(String[] args) {
        //We can initialize variable or data
// we can access/call creating object
//We can access/call by method
//We can access/call by constructor

        Employee employee=new Employee();
//classname referentialVariable = new Classname
// referentialVariable.(variable/methods)
       /* employee.eid=100;
        employee.eName="Masuma";
        employee.job="HR";
        employee.eSal=5000;
        employee.display();*/
        //similarly we can call other employee


////Approach 01--Using referentialVariable
//        Student student1= new Student();
//        student1.sid=101;
//        student1.sname="Masuma";
//        student1.grade='A';
//        student1.print();
//
////Approach 02  --Using methods
//
//        Student student2= new Student() ;
//        student2.setData(101,"Masuma",'A');
//        student2.print();

//Approach 03--Using constructor

        /*Student student= new Student(123, "MM",'A');
        student.print();

        Mehod_and_Constructor mc=new Mehod_and_Constructor();

        mc.greeting1();
        mc.greeting2();
        String s1=  mc.greeting2();
        System.out.println(s1);
        mc.greeting3("Masuma");
        mc.greeting4("Masuma");
        String s2= mc.greeting4("Masuma");
        System.out.println(s2);*/


        //ConstructorDemo cd= new ConstructorDemo();
        //cd.displayy();
        ConstructorDemo cd1= new ConstructorDemo(102,"Masuma");
        cd1.displayy();

        Method_Overloading mo=new Method_Overloading();
        mo.sum();
        mo.sum(30.25,20);
        mo.sum(5,6);
        mo.sum(10,10.00);
        mo.sum(0.0,0,0);
       // mo.sum(0,0,0.0);//Arithmetic exception
        mo.sum(10,0,0.0);

        ThisKeyword tk=new ThisKeyword(20,20);
        tk.display();
        tk.setData2(2,3);
        //or
        tk.setData(4,5);
        System.out.println(tk.x);//will take current value
        System.out.println(tk.y);
        System.out.println(new ThisKeyword(2,5));
        System.out.println(tk);
    }
}
