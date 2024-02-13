package variables;
public class Array1 {
    public static void main(String[] args) {
      boolean a=true;//2
      byte b;//8
      short c;//16
      int d=0b1101____0101_0001_1010;//32
          //
      long e=17_35822299;//64
      float f;//32
      double g;//64
      char h;//16
      int x=1;
      if(x==1)
      {
          int y=1;
          System.out.printf("%d\n",y);
          x=2;
          // int x;
          // Error ?Already Defined.
      }
        System.out.println(x);    
        //System.out.println(y);
        // Error ?
        // Cause Y doesn't exist here.It's out of it's scope or block.
    }
    
}
