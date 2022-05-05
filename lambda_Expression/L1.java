package lambda_Expression;
@FunctionalInterface
 interface I1 { void m1();}

public class L1 {
    public static void main(String[] args) {
        int id=1234;
        I1 b1=()->{System.out.println("id is "+id);};
        b1.m1();
    }
}