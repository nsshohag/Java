package block;
class Demo{
    int a;
    static int b;
    static{
        b++;
        System.out.println("Static block: b1="+b);
    }
    {
        a++;
        b++;
        System.out.println("a1="+a+" b1="+b);
    }
    
    {
        a++;
        b++;
        System.out.println("a1="+a+" b1="+b);
    }    
    
    
}
public class Block {
    int a;
    static int b;
    static{
        b++;
        System.out.println("Static block: b="+b);
    }
    {
        a++;
        b++;
        System.out.println("a="+a+" b="+b);
    }
    
    {
        a++;
        b++;
        System.out.println("a="+a+" b="+b);
    }
    public static void main(String[] args) {
        System.out.println("main method");
        Block ob1=new Block();
        Block ob2=new Block();
        Demo ob11=new Demo();
        Demo ob22=new Demo();
    }
}
