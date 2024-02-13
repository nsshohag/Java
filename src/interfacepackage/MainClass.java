package interfacepackage;
interface AA{
    void method();
    void ma();
}
interface BB{
    void method();
    void mb();
}
interface CC extends AA,BB{
    void method();//1
                  //void ma(); extened
                  //void mb();extended
    void ma();
    
}
public class MainClass implements CC,AA,BB {
    public void method() {
    }
    public void ma() {
    }
    public void mb() {
    }
            public static void main(String[] args) {
        
    }

}