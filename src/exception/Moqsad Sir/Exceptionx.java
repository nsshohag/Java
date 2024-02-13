import java.io.*;
public class Exceptionx{

public static void main(String args[]){

//--Unchecked or Runtime
try{
String str1="Sadat";
int arr[]={0,1};
String reg="2018331099";
String regx="Sadat2018331099";
Integer i=Integer.valueOf(reg);
//System.out.println(str1.charAt(5));
System.out.println(arr[2]);

System.out.println(i);
System.out.println(0/0);
System.out.println("If No Exception Exists Only Then This Line Will Be Executed");
}
catch(ArithmeticException var1){
System.out.println("Exception is : "+var1);
}
catch(Exception var2){
System.out.println("Exception is : "+var2);
}
//-- 
// -- Checked Exception or Compile Time Exception
//It doesn't matter wheather the file exists or not 
//for precaution this must be handled 
//FileInputStream ob=new FileInputStream("reg.txt");


}

}