package anonymousclass;
class B{
    void method(){
        System.out.println("method of B class");
    }
}
public class A {
    public static void main(String[] args) {
        B ob=new B(){
            void method(){
                System.out.println("method of class A");
            }
        };
        ob.method();
    }
}
