package javaapplication1;

import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        boolean st=true;
        while(st){
        try{
        Scanner x= new Scanner(System.in);
        System.out.println("Enter Num 1:");
        int num1=x.nextInt();
        System.out.println("Enter Num 2:");
        int num2=x.nextInt();
        System.out.println("Result :"+(double)num1/num2);
        System.out.printf("%.2f\n",(double)num1/num2);
        st=false;
        }
        catch(Exception e)
        {
            System.out.println("Exception :"+e);
            System.out.println("You must enter an integer");
        }
    }
        
    }
}
