package x.a.b.c.pk2;
import x.a.b.c.pk4.*;
//import pk.a.b.c.pk1.*;
//if class is in another package and not public you must need to import
//or give the full path when crating object.
class pk2 extends pk4{
void m1(){
System.out.println("m1 of B");
}
void m2(){
    System.out.println("m2 of B");
}
public static void main(String args[])
{
//Creating Object Without Importing
//Through direct adress
pk.a.b.c.pk1.pk1 ob1=new pk.a.b.c.pk1.pk1();
ob1.m1();
pk3 ob2=new pk3();
System.out.println("Protected class in Same Package "+ob2.x);

//pk4 ob3=new pk4();
//this wrong because we are trying to create object through pk4 class in another package
//we need to create object from child class
pk2 ob3=new pk2();
System.out.println("Protected Class in Different Package But Sub Class(extended) "+ob3.x);
}

}