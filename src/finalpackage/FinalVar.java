//final variable must be initialized
//can't be modified
package finalpackage;
public class FinalVar {
    final String name="Sadat";
    final int roll;//final blank variable must be initialized by constructor
    static final int age;//static blank final->
    //variable can't be initialized by constructor->
    //must be initialized by static block
    FinalVar(){
        roll=2018331099;
    }
    static{
        age=22;
    }
    public static void main(String[] args) {
        FinalVar ob=new FinalVar();
        System.out.println("Name: "+ob.name+" Roll: "+ob.roll+" Age: "+age);
    }
    
}
