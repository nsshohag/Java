package exception;
public class Throw {
    public static void main(String[] args) {
            //System.out.println(1/0);
            try{
            throw new ArithmeticException("Sadat");
            
            }
            catch(ArithmeticException x){
                System.out.println("What the fuck ?");
                return;
            }
            finally{
                System.out.println("I must will print though having return before ?");
            }

    }
    
}
