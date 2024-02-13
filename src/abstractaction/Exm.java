package abstractaction;
abstract class Shape{
    int dim1,dim2;
    Shape(int x,int y){
        dim1=x;
        dim2=y;
    }
    abstract void area();
}
class Circle extends Shape{
    Circle(int r){
        super(r,r);
    }
    void area(){
        System.out.println("Area of Circle: "+Math.PI*dim1*dim1);
        
        System.out.printf("Area of Circle: %.2f",Math.PI*dim1*dim1);
    }
}
class Rectangle extends Shape{
    //dim1,dim2
    Rectangle(int a,int b){
        super(a,b);
       // dim1=100;
       // dim2=b;
       //understand what the fuck is problem if above is writen.
    }
    void area(){
        System.out.println("Area of Rectangle: "+dim1*dim2);
    }
}
public class Exm {
    public static void main(String[] args) {
        Rectangle ob1=new Rectangle(10,10);
        ob1.area();
        Circle ob2=new Circle(10);
        ob2.area();
    }
}
