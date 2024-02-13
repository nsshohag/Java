/*Package must be the first statement*/ 
/* there can be only one package */
//package sust.cse.p.java;
package a.b.c;
public class P {
    public static void main(String[] args) {
        System.out.println("?");
    }
}
class A{
    
}
class B{
    
}
interface C{
    
}
//command shell compile and run
/*
1. javac-> compiler
2. -d -> create the directory structure
3. . ->place the directory in the current place or "" give the address
4. then give the file name
example
1 javac -d . P.java
2 javac -d "D:\CSE\Java\X\JavaApplication1\src\packagex" P.java

To run that class file you must go to the root directory and then do the following
java packagepath ClassName
example
java a.b.c.P;
*/