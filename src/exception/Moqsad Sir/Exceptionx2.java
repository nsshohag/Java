import java.io.*;
import java.util.*;
/*
Object class--> toString
*/

// For Checked Exception
class Exceptionx2{
void m3(){
try{
    System.out.println(10/0);
   }

catch(Exception e){
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
Exceptionx2 ob=new Exceptionx2();
ob.m1();
}

}