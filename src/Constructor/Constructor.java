package Constructor;
public class Constructor {
    int a;
    String b;
    Constructor()
    {
        
        
    }
    Constructor(int a,String b)
    {
        this.a=a;
        b=b;
        
    }
    public static void main(String[] args) {
        Constructor ob=new Constructor();
        Constructor ob2=new Constructor(3,"Sadat");
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob2.a);
        System.out.println(ob2.b);
    }
}
