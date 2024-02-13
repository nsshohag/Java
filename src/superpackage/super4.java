package superpackage;
class A{
    int roll;
    A(int roll){
        this.roll=roll;
    }
    void method()
    {   
        System.out.println("Roll: "+roll);
    }
}
class B extends A{
    String name;
    //int roll
    B(String name,int roll){
        super(roll);
        this.name=name;
    }
    void method()
    {
        System.out.println("Name: "+name);
        super.method();
    }
}
public class super4 {
    public static void main(String[] args) {
        B ob=new B("Sadat",2018331099);
        System.out.println("Name: "+ob.name+" Roll: "+ob.roll);
        ob.method();
        
    }
}
