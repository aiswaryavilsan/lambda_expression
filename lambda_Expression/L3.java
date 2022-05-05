//LAMBDA EXPRESSION-SINGLE VARIABLE
package lambda_Expression;
interface I3 {
    String m1(String name);
}

public class L3 {
    public static void main(String[] args) {
        I3 b3a=(name)->{
            return "Hello, "+name;
        };
        System.out.println(b3a.m1("Aiswarya"));

        I3 b3b= name ->{
            return "Hello, "+name;
        };
        System.out.println(b3b.m1("Vilsan"));
    }
}