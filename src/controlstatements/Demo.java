
package controlstatements;
public class Demo {
    public static void main(String[] args) {
        int arr[]={0,2,3,4,5};
        for(int x:arr)
        {
            //x=x*3;
            System.out.println(x);
            x=x*2;//This doesn't effect underlying array arr
        }
    }
}
