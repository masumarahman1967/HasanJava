package Java_Basic;

public class Mehod_and_Constructor {
    //Main method is our driver,
   /* Method-is block or group of statement/block of code
   We have to call method through object
   1.no params  no return value
   2. no params  return values
   3.takes params no return value
   4.Take params return value
    */
    /*
    Rules for return
    we call by creating object
    then hold it in a variable
    give data type of that variable
    then put it in print statement
     */


   // 1.no params  no return value
    void greeting1(){
        System.out.println("Hello... I am method that no returns and no parameters");
    }
    // 2. no params  return values
    String greeting2(){
        return ("Hello... I am method with returns value and no parameters");
    }
    // 3.takes params no return value
    void greeting3(String name){
        System.out.println("Hello... I am method no returns and with parameters  "+ name);
    }
    //4.Take params return value
    String greeting4(String name){
        return ("Hello... I am method with returns and parameters  " +name);
    }
}
 /*
 Method  VS constructor
 Method:
 1.Method name can be anything
 2.Method may or may not return any value
 3.If method is not returning then specify void(nothing/empty)
 4.Method can take parameters/arguments
 5.We have to call/invoke methods explicitly through object
 6.Used for logical concept/implement logic



 Constructor:
 1.Constructor name must be the same as class name/Method name must be different from class name
 2.Constructor never return any value
 3.we are not allow to specify VOID
 4.Constructor can take parameters/arguments
 5.Constructor automatically invoke at the time of object creation
 6.Constructor used for initializing/assigning the vale of variable

  */