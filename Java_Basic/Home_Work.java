package Java_Basic;
import java.util.*;

public class Home_Work {
   // String str;
    //String st;
    //Approch 01 -Using iteration and toCharArray
    public  static String rev_String(String str) {

        char[] ch= str.toCharArray();
        String reverse="";
        for(int i=ch.length-1;i>=0;i--){

            reverse+=ch[i];
        }
        return reverse;
    }
    //Approch 02 - using while loop
    public static void while_loop(){

        String st="We can reversed a string using while loop 02";
        int ilen=st.length();
        while(ilen>0){
            System.out.print(st.charAt(ilen-1));
            ilen--;
        }
    }

    public static void main(String[] args) {

        System.out.println(Home_Work.rev_String("Hello Java 01"));
        Home_Work.while_loop();
        System.out.println("@@@....");
   /*         Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name");
       String name=sc.next();

if( name.equalsIgnoreCase("Banna")){
    System.out.println("My brother name :"+ name);
}
else{
    System.out.println("Print my name : "+name);
}
*/


        //Swiping 2 number

        int a=5,b=6;
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("Print a and b ist approach::"+a+"  and  "+b);

        //logic 2 -use + & -
        a=a+b;//11
        b=a-b;//5
        a=a-b;//6
        System.out.println("ligic 2..."+ a);
        System.out.println("ligic 2..."+ b);

        //logic 3-- use  *  &  /
        a=a*b;//30
        b=a/b;//5
        a=a/b;//6

        System.out.println("ligic 3..."+ a);
               System.out.println("ligic 3..."+ b);

         //logic 4
        int a1=2,b1=6;

        b1=a1+b1-(a1=b1);

        System.out.println("Print  b.1.."+b1);
        System.out.println("Print a1.."+a1);
               //third higest number

/*
        Integer arr[]={2,50,5,10,40};

List<Integer> lt= Arrays.asList(arr);
        System.out.println("print asscending order::");
lt.stream().sorted().forEach(System.out::println);
        System.out.println("print reverse order ::");
lt.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("Skip 1st two then print rest of them ::");
lt.stream().sorted(Comparator.reverseOrder()).skip(2).forEach(System.out::println);
        System.out.println("Print only third higest ::");
lt.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
*/


//Reversed String

//Approach 03 using character

        String s= "I love my family";
       // String removeWhiteSp=s.replaceAll("\\s","");
        String revStr="";

   for(int i=0;i<s.length();i++){

       revStr=s.charAt(i)+revStr;
   }
        System.out.println("Character  3::"+revStr);

//Approach 04-string concatenation or for loop
        String t="My new string";
        String revt="";
        int len=t.length();
        for ( int i = len-1 ; i>=0; i--) {
            revt=revt+t.charAt(i);
        }
        System.out.println(" string concatenation  4::"+revt);
//Approach 05- String buffer

        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        System.out.println("String Buffer 5:"+sb);


        //Aproach 06 - using String Builder

        StringBuilder sbil=new StringBuilder(s);
        //sbil.append(" Miss you amma");
        sbil.reverse();
        System.out.println("StringBuilder  06::"+sbil);

 //Approch 07- list

// String s1="Reverse the String";
// char[] ch1=s1.toCharArray();
// List<Character>revS1=new ArrayList<>();
//
// for(char c : ch1){
//     revS1.add(c);
//     Collections.reverse(revS1);
//     ListIterator li= revS1.listIterator();
//     while(li.hasNext()){
//     System.out.print( li.next());
// }
//    }
        System.out.println("QQQQQQ...");
//Aproach 08- character array

   String s2="Charactr Array";
 char[] ch2=s2.toCharArray();
 String revs2="";
 for(int i=s2.length()-1;i>=0;i--){

     revs2=revs2+ch2[i];
}
        System.out.println("Approach 08..."+revs2);

 //Reverse number digit
// using - algorithm
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter your digit");
        int num=sn.nextInt();
        int rev=0;
        while(num !=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("Print reverse digit...:"+rev);
 // using String Buffer
int no=1234;
 StringBuffer sb2= new StringBuffer(String.valueOf(no));
        StringBuffer p=sb2.reverse();
        System.out.println("Print StringBuffer.."+p);

 // using String builder
 StringBuilder sd=new StringBuilder();
       sd.append(1020);
        StringBuilder revb =sd.reverse();
        System.out.println("Print  StringBuilder revb.."+revb);
    }}


