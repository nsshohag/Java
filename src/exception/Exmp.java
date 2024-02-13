package exception;
import java.util.Scanner;
public class Exmp{
    public static void main(String[] args) {
        while(true){
        try{
        int num1,num2,result;
        Scanner ob=new Scanner(System.in);
        System.out.println("Please enter num1: ");
        num1=ob.nextInt();
        System.out.println("Please enter num2: ");
        num2=ob.nextInt();
        result=num1/num2;
        System.out.println("Division num1/num2 is :"+result);
        }
        catch(Exception x){
            System.out.println("Exception is: "+x);
            System.out.println("You must give an integer !!! Please try again.");
          }       
        }
    }
}