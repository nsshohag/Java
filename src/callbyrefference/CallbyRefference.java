package callbyrefference;
public class CallbyRefference {
    String name="Preity";
    public static void main(String[] args) {
        CallbyRefference r1=new CallbyRefference();
        r1.name="Sadat";
        r1.method(r1);
        System.out.println("m "+r1.name);
    }
    void method(CallbyRefference r2)
    {
        r2.name="Rony";
        System.out.println("r "+r2.name);
    }
    
}
