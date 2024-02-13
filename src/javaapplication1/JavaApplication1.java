package javaapplication1;
class Fuck{
   private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
   
    void fuck(Fuck z)
    {
        z.x=0;
    }
    void fuck(double ... x){
        double sum=0;
        for( double i : x){
            sum=sum+i;
        }
      
        System.out.println(sum);
    }
  
}
public class JavaApplication1 extends Fuck {
    public static void main(String[] args) {
        Fuck ob1=new Fuck();
        ob1.fuck(6,9.9);
        JavaApplication1 gg=new JavaApplication1();
        gg.fuck(9,9,0);
        gg.setX(6);
        System.out.println(gg.getX());
    }
}
