//final method can be inherited but
//final method can't be overriden
package finalpackage;
class Parent{
    final void method(){
        System.out.println("method");
    }
}
public class FinalMethod extends Parent{
    public static void main(String[] args) {
        FinalMethod ob=new FinalMethod();
        ob.method();
    }
}
