package Java_Basic;

public class Control_Statement {
    /*Control Statements.......Control the execution the code
    1. Conditional Statements
    2.Looping Statements/iterative Statements ....for less condition
    3.Jumping statement
    */
    /*Conditional Statements - ..if match than run, if it doesn't then skip the set of conditions and move to the next
    1. if
    2. if else
    3. nested if else.....if true then it will in 1st block.
    4.switch case
    */
    /*Return true  or false  means boolean,[relational or logical operators  or comparison or conditional]
    if(Condition){
    statement
    }
    */

    public static void main(String[] args) {
        Control_Statement driver = new Control_Statement();
        driver.ifElseCondition();
        driver.evenOdd();
        driver.nestedIfElse();
        driver.ifCondition();
        driver.nestedIfElse2();
        driver.switchcase1();
        driver.whileloopCon();
        driver.whileloopCon1();
        whileloopCon2();
        doWhileloopCon1();
        doWhileLoopDec();
        play();
        jumpingStatement();
    }


public static void switchCase(){
        int weekday=1;
        switch(weekday){
            case 1 : System.out.println("Sunday"); break;
            case 2 : System.out.println("Monday");break;
            case 3 : System.out.println("Tuesday");break;
            case 4 : System.out.println("Wednesday"); break;
            default :
                System.out.println("Invalid");

}}
    public static void ifCondition() {
        int age = 18;
        if (age >= 18) {
            System.out.println("Eligible fo vote");
        }
    }

    public static void ifElseCondition() {

        int person_age1 = 17;
        if (person_age1 >= 18) {
            System.out.println("This person is eligible for vote");
        } else {
            System.out.println("This person is elegible for vote");
        }
    }

    // even or Odd
    public static void evenOdd() {
        int x = 100;
        if (x % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        //positive or negative or zero ....multiple condition
        int num1 = -10;
        if (num1 > 0) {
            System.out.println("The num1 is positive");
        } else if (num1 < 0) {
            System.out.println("The num1 is negative");
        } else {
            System.out.println("The num1 is ZERO");
        }


        //largest number
        int xx = 100, y = 200, z = 300;
        if (xx > y && xx > z) {
            System.out.println("xx is the largest number");
        }
        if (y > xx && y > z) {
            System.out.println("y is the largest number");
        }
        if (z > xx && z > y) {
            System.out.println("z is the largest number");
        }
    }

    //nestedIfElse
    public static void nestedIfElse() {
        if (true) {
            if (true) {
                System.out.println("This is true");
            } else {
                System.out.println("This is true but not exactly what we want");
            }
        } else {
            System.out.println("This is flase");
        }
    }

    public static void nestedIfElse2() {

        if (false) {

            if (true) {
                System.out.println("This is abc");
            } else {
                System.out.println("This is pqr");
            }
        } else {
            System.out.println("this is xyz");
        }
    }
//Switch Case
    /*
     * switch(variable){
     *        case  "VALUE"  :   STATEMENTS;  BREAK;
     *      DEFAULT   :   STATEMENTS;
     *      }
     */

    public static void switchcase1() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday,school is poen");
                break;
            case 2:
                System.out.println("Tuesday, parking is open for student");
                break;
            case 6:
                System.out.println("Saturday, school is closed");
                break;
            default:
                System.out.println("No school day, Student parking is closed");
        }
    }

    /*   Looping statement
     *   while loop
     *   do while loop
     *   for loop[NESTED LOOPS]
     *   enhance loop / for each loop         */

  /*
  while(condition){
        STATEMENT;
        INC/DEC;//++  or  __
        }

   .....must inc/dec otherwise loop never end
   ....boolean condition must be true, false loop stop automatically
  */

    /* NESTED LOOPS....INNER LOOP AND OUTER LOOP[LOOP INSIDE ANOTHER LOOP]

    for(STATEMENTS1; STATEMENT2; STATEMENT3){

    for(STATEMENTS1; STATEMENT2; STATEMENT3){

    CODE OF BLOCK TO BE EXECUTED
    }
    CODE OF BLOCK TO BE EXECUTED
    }
     */

    /*   FOR EACH LOOP or ENHANCED FOR LOOP...used for array OR COLLECTION
                ...it traverses each element one by one
                ...eliminates bugs/error and make code readable
                ...cannot traverse reversed order
                ...no option to skip..
                ...cannot works for odd or even
                ...not index basis

    fo(type variable name  :  arrayName/collection){
    statements;//code block to be executed
       }
     */

    public static void whileloopCon() {

        int i = 1;  //initilization
        while (i <= 25) {
            System.out.println(i);
            i++;
        }
    }

    public static void whileloopCon1() {
        System.out.println("Assending order....");
        int i = 10;  //initilization
        while (i <= 25) {
            System.out.println(i);
            i++;
        }
    }

    public static void whileloopCon2() {
        System.out.println("Desending order......");
        int x = 25;//initialization
        while (x >= 5) {
            System.out.println(x);
            x--;
        }

    }

    /* Do while loop....................

      do{
    STATEMENTS;
    update statement;
             } (condition);


    ....execute at least once
    .....1ST EXECUTE THE CODE THEN CHECK THE CONDITION
    ..... CONDITION MUST BE TRUE
    .....USE ++/__ OTHERWISE CONDITION NEVER ENDS
    */
    public static void doWhileloopCon1() {
        System.out.println("doWhileloopCon1....");
        int i = 12;  //initilization
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void doWhileLoopDec() {
        System.out.println("Print decending for do while loop....");
        int y = 15;
        do {
            System.out.println(y);
            y--;
        } while (y >= 5);
    }
/* FOR LOOP........
----use foe reduce the line of code.

    for(STATEMENTS1; STATEMENT2; STATEMENT3){
        statement;
        CODE OF BLOCK TO BE EXECUTED
      }
     */

    public static void forLoop() {
        System.out.println("Print 1 to 10");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Print even no");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }


        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

            }
        }

public static void play(){
        System.out.println("@@@");
            for (int i = 0; i <= 10; i++) {
        if (i == 2 || i==3 || i!=4)  {
            System.out.println(i);
        }
    }
    System.out.println("@@@@@...");
            boolean flag=false;
           if (flag){
               for (int i=0;i<=10;i++){
                   System.out.println(i);
               }
           }
           else{
               for (int i=10;i>1;i--){
                   System.out.println(i);
               }
           }
}

public static void jumpingStatement(){
    System.out.println("####");
        for(int i=1;i<=5;i++){
            if(i==3 || i==4) {
               // break;
                continue;
            }
                System.out.println(i);

        }
}
}

