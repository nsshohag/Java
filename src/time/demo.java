package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo {
    public static void main(String[] args) {
        Date var=new Date();
        System.out.println(var);
        DateFormat dtform=new SimpleDateFormat("dd/MM/YYYY");
        String x=dtform.format(var);
        System.out.println("Current date :"+x);
    }
 
}
