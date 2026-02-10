import java.util.*;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args){

        List <String> users = List.of("smriti","shruti","rishabh","mohit");
        List<String> filteredUser = users.stream().filter(u->u.length()<5).collect(Collectors.toList());
        filteredUser.forEach(System.out::println);
    }
}
