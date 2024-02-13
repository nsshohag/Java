/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WrapperClass;

/**
 *
 * @author nssho
 */
public class Demo {
    public static void main(String[] args) {
     //primitive -> object = autoboxing
     int x=10;
     Integer ob= Integer.valueOf(x);//Integer ob=x;
        System.out.println(ob);
     //object -> primitive = unboxing
     Double ob2=new Double(10.6);
     double y=ob2.doubleValue();//double y=ob2;
        System.out.println(y);
    }
}
