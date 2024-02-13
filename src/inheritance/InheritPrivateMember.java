package inheritance;
class Parent{
    private String x;
    void set(String x)
    {
        this.x=x;
    }
    String get()
    {
        return this.x;
    }
}
public class InheritPrivateMember extends Parent{
    public static void main(String[] args) {
     InheritPrivateMember ob=new InheritPrivateMember();
     ob.set("Sadat");
        System.out.println(ob.get());
        System.out.println(ob instanceof Parent);
        System.out.println(ob instanceof InheritPrivateMember);
    }
}
