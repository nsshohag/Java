package arguments;
public class VariableArguments {
    public static void main(String[] args) {
        method(1);
        method(1,2);
        method(1,2,3);
    }
    public static void method(int ... num){
        int sum=0;
        for(int x: num)
            sum=sum+x;
        System.out.println("Sum of N numbers is: "+sum);
        
    };
}
