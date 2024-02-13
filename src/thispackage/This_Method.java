package thispackage;
class Demo{
    void method1(){
        System.out.println("method1");
    }
    void method2(){
        this.method1();
        System.out.println("method2");
    }
    
}
public class This_Method {
    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.method2();
    }
}
