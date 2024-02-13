package abstractaction;
class XX{
    int a;
    int b;
    XX(){
     a=0;
     b=9;
    }
    
}
public class XXX extends XX{
    public static void main(String[] args) {
        XX ob=new XX();
        System.out.println(ob.a+ob.b);
    }
}
