package encapsulation;
class Demo{
    Demo(){
        y=100;
    }
    private int x;
    private int y;
    void set(int x){
        this.x=x;
    }
    int get()
    {
        return x; 
    }
    int gety()
    {
        return y;
    }
    
    
}
public class Encapsulation {
    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.set(-100);
        System.out.println(ob.get());
        System.out.println(ob.gety());
        
    }
}
