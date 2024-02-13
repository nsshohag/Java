package variables;
public class StaticVar{
    int a ;
    int b;
    static int c=10;
    StaticVar(int a,int b){
        this.a=a;
        this.b=b;
    }
    public static void main(String[] args) {
       c=11;
        System.out.println(c);
        StaticVar ob=new StaticVar(1,1);
        StaticVar ob1=new StaticVar(0,0);
        System.out.println("a="+ob.a+" b="+ob.b+" c="+c);
        System.out.println("a="+ob1.a+" b="+ob1.b+" c="+c);
        System.out.println(Array.x);
    }
}
