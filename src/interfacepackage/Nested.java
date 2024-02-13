package interfacepackage;
interface It1{//Nested Interface
    int finalvar=10;
    interface It2{
     int finalvar=20;   
     void method();
     void method1();
    }
    void method();
    void method2();
}
class CCC{//Nested Interface Class
    interface It3{
        void method3();
    }
}
public class Nested implements It1,It1.It2,CCC.It3{//Nested Interfaces are accessed
    public void method(){
        System.out.println("0");
    }
    public void method2(){
        System.out.println("2");
    }
    public void method1(){
        System.out.println("1");
   }
    public void method3(){
        System.out.println("3");
    }
    public static void main(String[] args) {
       Nested ob=new Nested();
       ob.method();
       ob.method1();
       ob.method2();
       ob.method3();
       
       //System.out.println(finalvar);
       //Error? Ambiguity
        System.out.println(It1.finalvar);
        System.out.println(It1.It2.finalvar);//or System.out.println(It2.finalvar);
    }
}
