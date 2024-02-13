import java.io.*;
import java.util.*;
class Exceptionx4{

public static void main(String args[]){

try {
    System.out.println("A");
    FileInputStream ob=new FileInputStream("reg.txt");
    //Thread.sleep(1000);
    Thread.sleep(1000);
    }
/*For checked exception if we use any checked exception then the chance to occur exception
 must be present in the try block or we will get compile time error.*/
catch(FileNotFoundException | InterruptedException e){
    System.out.println("B");
    }
System.out.println("C");
}
}
