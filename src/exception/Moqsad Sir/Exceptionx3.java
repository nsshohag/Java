import java.io.*;
import java.util.*;
/*
Object class--> toString
*/

// For Un-Checked Exception
class Exceptionx3{
void m3(){
try{
   FileInputStream fc=new FileInputStream("reg.txt");
   FileInputStream fcx=new FileInputStream("nfweiufnweuifnuwefnwenfw.txt");
   System.out.println("EFG");
   System.out.println("SUST");
   }
catch(FileNotFoundException e){
    System.out.println("ABC");
    System.out.println("SUST");
    System.out.println(e.toString());
    System.out.println(e.getMessage());
    e.printStackTrace();
   }
   }
void m2(){
    m3();
}

void m1(){
    m2();
}
public static void main(String args[])
{
Exceptionx3 ob=new Exceptionx3();
ob.m1();
}
}