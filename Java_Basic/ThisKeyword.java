package Java_Basic;

public class ThisKeyword {
/*  this() keyword refers to the current class object in a method or constructor

    Uses of this keyword:
    this can be used to current class instance variable
    Invoke current class constructor
    invoke current class method implicitly
    Return current class object
    Pass an argument in the method call
    Pass an argument in the constructor call

*****this() does not work with static method
     this() means class object
     when we have to call multiple constructor with ih the same class we have to use this keyword
 */


    int x,y;

//invoke current class method implicitly
     void setData(int x,int y){
       this.x =x;
        this.y=y;
    }
    void setData2(int x,int y){
        int sum=x+y;
        System.out.println(sum);
    }


    //Invoke current class constructor
    ThisKeyword(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }

}
