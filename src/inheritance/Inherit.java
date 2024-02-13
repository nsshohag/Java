package inheritance;
class ParentX{
    ParentX(){
        System.out.println("ParentClass/SuperClass Constructor");
    }
    {
        System.out.println("Parent Ins Block");
    }
    static{
        System.out.println("Parent Static Block");
    }
}
public class Inherit extends ParentX{
    static{
        System.out.println("Child Static Block");
    }
    Inherit(){
        
        System.out.println("SubClass/ChildClass Constructor");
    }
        {
        System.out.println("Child Ins Block");
    }
    public static void main(String[] args) {
        Inherit child=new Inherit();
        //Parent Constructor is Initialized First
        //Then Child Constructor
        //And it really sucks
       // ParentX parent=new ParentX();
    }
}

