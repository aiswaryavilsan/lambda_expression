package lambda_Expression;

@FunctionalInterface
interface I6 {
    String S6(String m);
}

public class L6 {
    public static void main(String[] args) {
        I6 person = (m)-> {
            String s1 = "HELLO, ";
            String s2 = s1 + m;
            return s2;
        };
        System.out.println(person.S6("AISWARYA"));
    }
}