/*
Nested Class 3 types
1 Member Class
2 Static Class
3 Annonymous Class
*/
public class Demo {
    public static void main(String args[]) {
        //Inner ob1=new Inner();
        //inner doesn't have that scope
        //inner class can't be instantiated
        Outer ob=new Outer(); 
        Outer.Inner ob2=ob.new Inner();//Accesing Inner method through outer class object for member class
        Outer.InnerClass ob3=new Outer.InnerClass();//for static inner class we don't need to create an object
        ob.method();
        ob2.innermethod();
        ob3.innermethod();
    }
}
class Outer
{
   int x=0;
   public void method()
   {
       System.out.println("Outer Method");
   }

   class Inner//Inner Class/Member Class
   {
       public void innermethod()
       {
          method();//inner method can acces outer method because it is in it's scope
          //and we acces it through outer method object
          System.out.println("Inner method of member class");
       }
   }
   static class InnerClass
   {
       void innermethod()
       {
         System.out.println("Inner method of static class");
       } 
   }

}