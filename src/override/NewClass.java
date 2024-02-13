package override;
class Demo{
    int x;
    static int y;
    final int z=0;//Needs to be Initialized
    //and final method or variable can't be overridden
    void method()
    {
        System.out.println("Method of DemoClass");
    }
    final void methoddemo(){
        System.out.println("final method");
    }
}
public class NewClass extends Demo{
    //int x : inherited member but overridden so explicit/hidden.
    int x=1;
    //final int z is inherited but can't be overridden
    static int y;//static field already exist so fuck off
    void method(){
        System.out.println("Method of NewClass");
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        NewClass ob=new NewClass();
        System.out.println(ob.x);
        System.out.println(ob.z);//
        ob.method();
    }
}
