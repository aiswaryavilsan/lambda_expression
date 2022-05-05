package lambda_Expression;

interface I4 {
    int m4(int a, int b);
}

public class L4 {
    public static void main(String[] args) {
        I4 ad1=(a, b)->(a+b);
        System.out.println(ad1.m4(10,20));
        I4 ad2=(int a, int b)->(a+b);
        System.out.println(ad2.m4(100,200));
    }
}