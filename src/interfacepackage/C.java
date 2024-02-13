package interfacepackage;
interface A{// 100% Abstraction
    int reg=2018331099;//==public static final reg=2018331099
    // and it can't be modified
    void method();//==public & abstract
}
interface B{
    public static final int age=22;//will be ambiguous.so can't be used being final static
    void method();
}
interface X{
    double height=1.7;
    void method();
}
public class C implements A,B,X{
    public void method(){// overridden method should be public
        System.out.println("method");
    }
    public static void main(String[] args) {
        C ob=new C();
        ob.method();
        A in1=ob;
        //ob.method();
        System.out.println(A.reg);
        System.out.println(age);
        System.out.println(height);
    }
    
}