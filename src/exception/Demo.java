//Catch blocks sequence must be like this
//
package exception;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        
       try {
           Scanner ob=new Scanner(System.in);
           int num=ob.nextInt();// In
           int x=0;
           int y=0;
           System.out.println("x/y="+x/y);// ArithMeticException Rntime
           //ClassX ob1 =new ClassX();// Class Not Found Compile Time
       }
       catch (ArithmeticException x){
          // System.out.println("Exception is: "+x);
       }
       catch(ArrayIndexOutOfBoundsException x){
           System.out.println("Exception is: "+x);
       }
       catch(Exception x){
           System.out.println("Exception is: "+x);
       }
       finally{
          System.out.println("Finally will execute no matter exception is catch or not"); 
       }
        System.out.println("Last line of program");
    }
}
