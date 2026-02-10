import java.util.*;
public class SortAlist {
    public static double calculateAverage(ArrayList<Integer> list){
        int count =0;
        double sum=0;
        for(int x:list){
            if(x>=0){
                sum=sum+x;
                count++;
            }
        }

 return (count>0)? (sum/count):0.0;
    }
    public static void main(String[] args){
        ArrayList<Integer> mylist= new ArrayList<>(List.of(1,2,3,-4,5,6-8,-9,10));
       System.out.println(calculateAverage(mylist));
    }
}
