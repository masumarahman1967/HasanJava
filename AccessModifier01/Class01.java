package AccessModifier01;

import AccessModifiers2.TestClass02;

public class Class01 extends TestClass02{

    public static void main(String[] args) {
        TestClass02 tc2 = new TestClass02();
        tc2.displayPublc();

        Class01 c01=new Class01();
        c01.displayProcted();


    }
}
