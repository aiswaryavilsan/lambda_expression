//LAMBDA FOR EACH LOOP
package lambda_Expression;
import java.util.*;
public class L5 {
    public static void main(String[] args) {

        List<String> l=new ArrayList<String>();
        l.add("Bab");
        l.add("Sanj");
        l.add("Piglu");

        l.forEach(
                (n)->System.out.println(n)
        );
    }
}