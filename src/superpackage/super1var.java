package superpackage;
class Parent1{
    int x;
    static int y;
}
public class super1var extends Parent1{
    int x=1;

    public static void main(String[] args) {
        super1var ob=new super1var();
        System.out.println(ob.x);
        ob.method();
    }
    void method()
    {
        System.out.println(super.x);
    }
}
