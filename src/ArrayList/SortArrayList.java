package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
         ArrayList<String> x1=new ArrayList<String>();
         x1.add(0,"sadat");
         x1.add("sada");
         x1.add("sad");
         Collections.sort(x1);
         System.out.println(x1);
         Collections.sort(x1,Collections.reverseOrder());
         System.out.println(x1);
    }
  
}
