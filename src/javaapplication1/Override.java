package javaapplication1;
class M1{
     String x;
     int age;
     char c;
     static final int var;
     static{
         var=77;
     }
    M1(String x,int age){
        this.x=x;
        this.age=age;        
    }
    M1(String x,int age,char c)
    {   
        this(x,age);
        this.c=c;
    }
     final void m1(){
        this.m2();
        System.out.println("A");
        
    }
   final void m2(){
        System.out.println("B");
    }
}

public class Override{   
    public static void main(String[] args) {
    M1 x=new M1("Sadat",22,'x');
        System.out.println("Name: "+x.x+" Age: "+x.age+" "+x.c);
        x.m1();
        System.out.println(M1.var);
    }

}
