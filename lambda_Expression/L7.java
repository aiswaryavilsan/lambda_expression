//LAMBDA EXPRESSION MULTIPLE STATEMENTS
package lambda_Expression;
@FunctionalInterface
interface I7 {
    String m5(String message);
}

public class L7 {
    public static void main(String[] args) {
        I7 b7 = (message)-> {
            String str1 = "HELLO, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(b7.m5("HOW ARE YOU."));
    }
}