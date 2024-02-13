package string;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s1="Sadat";
        System.out.println(s1.charAt(4));
        System.out.println(s1.indexOf("dat"));
        String s2=new String("Sadat");
        String s4="I am dead";
        s4=s4.replace('m','M');
        System.out.println(s4);
        String[] s5=s4.split(" ");
        for(String x:s5){
            System.out.println(x);
        }
        if(s1==s2)
        System.out.println("S1==S2");
        else
            System.out.println("S1!=S2");
        //beacsue compare reference/object not value
        if(s1.equals(s2))
        System.out.println("S1==S2");
        else
            System.out.println("S1!=S2");
        char[] s3={'P','R','E','I','T','Y'};
        System.out.println(s3);
        System.out.println("length of s1: "+s1.length());
        System.out.println(s1+s2+s3);//fuck error.why ?
    }
}
