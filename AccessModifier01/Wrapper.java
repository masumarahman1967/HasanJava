package AccessModifier01;

public class Wrapper {
    /*
    The wrapper class in java provides the machanism to convert primitive into object and also vise versa.
     */

    int a=100;//primitive data

Integer aa=100;//auto Boxing
void dissplay(){
    System.out.println(a);
}

    public static void main(String[] args) {
        Wrapper wp=new Wrapper();

        System.out.println(wp.aa+100);
        char c='B';
        byte b=10;
        Byte obj=b;
        obj.intValue();
        obj.toString();
        obj.byteValue();
        System.out.println(obj);
        System.out.println("object"+obj+10);
        System.out.println("object"+(obj+10));
    }


}
