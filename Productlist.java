import java.sql.Array;
import java.util.*;

class product{
    String category ;
    double price ;
    String name;

    public product(String name,double price,String category){
        this.category=category;
        this.price=price;
        this.name=name;
    }
    public String getCategory(){return category;}
    public double getPrice(){return price;}
}


public class Productlist {
    public static void main(String[] args){
        List<product> products = Arrays.asList(
                new product("laptop",22000.00,"electronics"),
                new product("bag",2200,"accessories"),
                new product("phone",36000,"electronics"),
                new product("camera",2300,"electronics")
        );

        OptionalDouble Avg = products.stream()
                .filter(p->p.getCategory().equalsIgnoreCase("electronics"))
                .mapToDouble(p->p.getPrice()*0.9)
                .average();

        if(Avg.isPresent()){
            System.out.println("average of electronics "+Avg.getAsDouble());
        }else{
            System.out.println("no electronics found!");
        }
    }
}
