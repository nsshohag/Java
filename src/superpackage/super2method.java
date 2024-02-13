package superpackage;
class Parent{
    void method()
    {
        System.out.println("method of Parent Class");
    }
    void m(){
        method();
    }
}
public class super2method extends Parent{
    @Override
    void method()
    {   
        System.out.println("Overriden Method");
        super.method();
    }
    void m(){
        super.method();
    }
    public static void main(String[] args) {
        super2method ob=new super2method();
        ob.method();
        ob.m();
    }
}
