package time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timedemo {
    public static void main(String[] args) {
        LocalTime x=LocalTime.now();
        System.out.println(x);
        DateTimeFormatter var=DateTimeFormatter.ofPattern("hh/mm/ss");
        System.out.println(x.format(var));
        String s=x.format(var);
        System.out.println(s);
    }
}
