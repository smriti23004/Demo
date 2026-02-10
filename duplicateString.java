//to create a list of duplicate strings and sort them using list and set

import java.util.*;
public class duplicateString {
    public static void main(String args[]){

        List<String>originalList = Arrays.asList("smriti","shruti","smriti","shruti","simon");

        Set<String> intermediateSet = new LinkedHashSet<>(originalList);

        List <String>  newList= new ArrayList<>(intermediateSet);

        System.out.println("The original list"+originalList);
        System.out.println("the new list"+newList);

    }
}
