interface discountCalculator{
    double apply(double price);

    default double applyBulkDisccount(int quantity,double price){
        if(quantity>10){
          return  apply(price)* quantity;
        }
        return price*quantity;
    }
}

public class discount1 {
    public static void main(String[] args){
        discountCalculator tenpercentoff = price->price*0.9;
        double singleitem = tenpercentoff.apply(100.0);
        double bulkitem = tenpercentoff.applyBulkDisccount(10,100.0);
        System.out.println("the price of single item is"+singleitem);
        System.out.println("the price of bulk items is:"+bulkitem);
    }
}
