package ArrayList;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> x=new ArrayList<String>();
        System.out.println(x.size());
        x.add("Sadat");
        x.add("Rony");
        x.add("Preity");
        x.add("Susmoy");
        x.add(3,"Kawser");
        x.set(4,"Susu");
        System.out.println("Does Sadat Exists: "+x.contains("Sadat"));
        System.out.println("indexOf of Sadat is: "+x.indexOf("Sadat"));
        for(int i=0;i<x.size();i++)
        {
            System.out.println(x.get(i));
        }
        for(String p:x)
        System.out.print(""+p+" ");
        System.out.println("");
        x.remove(4);
        System.out.println(x);
        x.removeAll(x);//or x.clear();
        System.out.println(x);
        System.out.println("ArrayList Empty ? "+x.isEmpty());
         ArrayList<String> x1=new ArrayList<String>();
         ArrayList<String> x2=new ArrayList<String>();
         x1.add(0,"S");
         x2.add(0,"S");
         System.out.println(x1.equals(x2));
    }
 
}
