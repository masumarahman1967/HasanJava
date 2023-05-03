package Inheritance;


//Multiple class is needed.
//we should not chage the definetion/name of the method but we can change the body
//methods name are same
//returntype must same
class CapitalBank{

    double roi(){
        return 0.0;
    }
}

class Valley extends CapitalBank{

    double roi(){
        return 10.5;
    }
}
class BoA extends CapitalBank{

    double roi(){
        return 9.5;
    }
}
public class Overriding {
    public static void main(String[] args) {
        Valley vl =new Valley();
        System.out.println(vl.roi());//10.5
        BoA boa=new BoA();
        System.out.println(boa.roi());//9.5


        CapitalBank cb=new CapitalBank();
        System.out.println(cb.roi());//0.0
    }
}
