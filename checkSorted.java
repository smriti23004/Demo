import java.util.*;
public class checkSorted {

    public static String checklistSort(ArrayList<Integer>list){

        boolean ascending = true;
        boolean descending = true;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                ascending=false;
            }
            if(list.get(i)<list.get(i+1)){
                descending= false;
            }
        }
        return(ascending||descending)?"sorted":"this is not sorted";

    }
    public static  void main(String[]args){
        ArrayList<Integer> list1= new ArrayList<>(Arrays.asList(1,2,34,5,6));
        ArrayList<Integer> list2= new ArrayList<>(Arrays.asList(1,2,4,5,6));
        ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(9,8,7,6,5));
        System.out.println("list  1 is:"+checklistSort(list1));
        System.out.println("list  2 is:"+checklistSort(list2));
        System.out.println("list  3 is:"+checklistSort(list3));



    }
}
