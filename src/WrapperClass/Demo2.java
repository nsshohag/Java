package WrapperClass;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        boolean b=true;
        char[] c={'a','b'};
        String s=Boolean.toString(b);
        String s1=Arrays.toString(c);
        System.out.println(s);
        System.out.println(s1);
        String s2="10001";
        int i=Integer.valueOf(s2);
        System.out.println(i);
    }
}
