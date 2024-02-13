//final class can't be inherited
package finalpackage;
final class Demo{
    void method(){
        System.out.println("method");
    }
}
public class FinalClass {
    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.method();
    }
}
