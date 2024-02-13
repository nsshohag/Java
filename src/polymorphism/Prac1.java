package polymorphism;
class A extends C{
    void method(){
        System.out.println("A");
    }
}
class B extends C{
    void method(){
        System.out.println("B");
    }
}
class C{
    void method(){
        System.out.println("C");
    }
}
public class Prac1 extends C{
    void method(){
        System.out.println("Prac1");
    }
    public static void main(String[] args) {
        C ob=new C();
        ob.method();
        ob=new A();
        ob.method();
        ob=new B();
        ob.method();
        ob=new Prac1();
        ob.method();
    }
}
