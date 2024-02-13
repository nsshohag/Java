package inheritance;
class Parent{
    Parent(){
        x=1;
        z=1;
    }
    int x;
    static int x1;
    private int y;
    private static int y1;
    protected int z;
    protected static int z1;
    public int a;
}
public class Child extends Parent {
    //private member can't be inherited
    //z1
    //a
    public static void main(String[] args) {
        System.out.println(Child.x1+Child.z1);
        Child ob=new Child();
        System.out.println(ob.x+ob.z);
    }
}
