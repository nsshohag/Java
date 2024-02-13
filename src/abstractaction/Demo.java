package abstractaction;
abstract class Parent{
    abstract void method1();//abstract method musn't have body
    void method2(){
        System.out.println("m2");
    }
}
class Child extends Parent{
    void method2()
    {
        System.out.println("Overridden Method");
    }
    void method1(){
        super.method2();
        method2();
        System.out.println("???");
    }
}
public class Demo{
    public static void main(String[] args) {
        Child ob=new Child();
        ob.method1();
        Parent ox;
        ox=new Child();
        ox.method1();
        
        Parent oz=ob;//Abstract Class Can Create Refference Varibale
                     //If It Is Overridden Else We Can't Do It.
        oz.method1();
     
    }
}
