package override;
class A{
    protected void m1(){
        
    }
    void m2(){
        
    }
    public void m3(){
        
    }
}
public class Scope extends A{
    public void m1(){
       System.out.println("The protected can be changed to public");   
    }
   public void m2(){
       System.out.println("The default can be changed to public");
   }
   public void m3(){
       System.out.println("The public will always remain public");
   }
    public static void main(String[] args) {
        
        Scope ob=new Scope();
        ob.m1();
        ob.m2();
        ob.m3();
    }
}
