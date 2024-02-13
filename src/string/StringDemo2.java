
package string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String x=ob.next();
        System.out.println(x);
        StringBuffer sb=new StringBuffer(x);
        String y=sb.reverse().toString();
        if(x.equals(y))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}