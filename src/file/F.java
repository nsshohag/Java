package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class F{
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\CSE\\Java\\X\\Sim.java");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        Scanner ob=new Scanner(file);
        FileWriter wr=new FileWriter("D:\\CSE\\Java\\X\\A"+"\\"+file.getName());
        while(ob.hasNextLine())
        {
            String line=ob.nextLine();
            System.out.println(line);
            wr.write(line+"\n");
        }
        ob.close();
        wr.close();
        File x=new File("D:\\CSE\\Java\\X");
        File[] childs=x.listFiles();
        Arrays.stream(childs).forEach(e -> System.out.println(e.getName()));
}
}
