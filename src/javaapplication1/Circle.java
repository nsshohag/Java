package javaapplication1;

/**
 *
 * @author nssho
 */
public class Circle extends Abs{
     
     Circle(int r){
         super(r);
     }   
     int area()
     {
        int result;
        result=r*r;
        return result;
     }
    public static void main(String[] args) {
        Circle ob=new Circle(4);
        System.out.println(ob.area());
        System.out.println(4.4);
    }
}
