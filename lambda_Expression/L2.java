//LAMBDA - NO PARAMETER
package lambda_Expression;
interface I2 {
    String m2();
}
public class L2 {
    public static void main(String[] args) {
        I2 b2=()->{return "HELLO";};
        System.out.println(b2.m2());
    }
}