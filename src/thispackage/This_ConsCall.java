package thispackage;
class Parent{
    String name;
    int roll;
    int age;
   Parent(String name){
       this.name=name;       
   }
   Parent(String name,int roll){
       this(name);
       this.roll=roll;
   }
   Parent(String name,int roll,int age)
   {
       this(name,roll);
       this.age=age;
   }
   void method()
   {
       System.out.println(name);
       System.out.println(roll);
       System.out.println(age);
   }
}
public class This_ConsCall {
    int roll;
    This_ConsCall(int roll){
        this.roll=roll;
    }
    public static void main(String[] args) {
        Parent ob1=new Parent("Preity");
        Parent ob2=new Parent("Sadat",2018331099);
        Parent ob3=new Parent("Rony",2018331053,18);
        System.out.println("Name: "+ob1.name);
        System.out.println("Name: "+ob2.name+" Roll: "+ob2.roll);
        ob1.method();
        ob2.method();
        ob3.method();
    }
}
