package variables;
public class Casting {
    public static void main(String[] args) {
        float x=3.3F;//must append f or F for float
        byte a=50,b=50,c=100;
        short b1=0;
        char b2='A';
        int d=a*b/c; //here a*b is performed by int
        System.out.println(d);
        b1=(short)(b1+100);
        b2=(char)(b2*1);
        b2=(char)(b2+25);
        
        //b1=b1*2; //error ! here b1*2 is performed by int
        //b=b*2; //error ! here b*2 is performed by int
        //b=b+2; //error ! here b+2 is performed by int
        //can't assign int to byte.so need to type cast
        b= (byte)(b*2);
        b=(byte)(b+0);
        boolean bool=true;
        //error can't be typecasted or autotyped
        // System.out.println((int)bool);
        System.out.println(b+x); 
        System.out.println(b1); 
        System.out.println(b2); 
    }
}
