class Exceptionx5{
int m1(){
try{
    return 1;
}
catch(Exception e){
    return 2;
}
finally{
return 3;
}
}
public static void main(String args[]){
Exceptionx5 ob = new Exceptionx5();
System.out.println(ob.m1());
try {
    System.out.println(0/0);
    try{
        System.out.println("CSE".charAt(4));
    }
    catch(Exception e1){
        System.out.println(e1);
    }
}
catch(Exception e2){
    System.out.println(e2);
}
finally{
System.out.println("?");
}   
}
}