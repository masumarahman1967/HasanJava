package Java_Basic;

public class Student {
//class or instance or global variable
    int sid;
    String sname;
    char grade;
    void print(){
        System.out.println( sid+"  "+sname+"  "+ grade);
    }


    //no need return--1+1 ,return 2 data type int
    //To access class variable we have to do parameterize
    void setData(int id,String name,char g){

        sid=id;//local variable
        sname=name;
        grade=g;
    }

    Student(int id,String name,char g){

        sid=id;
        sname=name;
        grade=g;
    }

}
