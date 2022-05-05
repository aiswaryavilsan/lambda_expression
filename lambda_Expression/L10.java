package lambda_Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
class Product1{
    int id;
    String name;
    float price;
    public Product1(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class L10 {
    public static void main(String[] args) {
        List<Product1> list=new ArrayList<Product1>();
        list.add(new Product1(1,"Samsung",17000f));
        list.add(new Product1(3,"Iphone",65000f));
        list.add(new Product1(2,"Sony",25000f));
        list.add(new Product1(4,"Nokia",15000f));
        list.add(new Product1(5,"Redmi",26000f));
        list.add(new Product1(6,"Lenevo",19000f));

        Stream<Product1> filtered_data = list.stream().filter(p -> p.price > 20000);

        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );
    }
}