import java.util.function.Predicate;

public class Passwordcheck {
    public static void main(String[] args){
        Predicate<String> isLongEnough = s->s.length()>8;
        Predicate<String> containsSpecialChar = s->s.contains("#")||s.contains("!");
        Predicate<String> password = isLongEnough.and(containsSpecialChar);

        String pwd ="abcedfgh##";
        System.out.println("is long enough ? :"+ isLongEnough.test(pwd));
        System.out.println("contains special character?:"+ containsSpecialChar.test(pwd));

        if(password.test(pwd)){
            System.out.println("the password is valid");
        }else{
            System.out.println("the password is not valid!");
        }

    }
}
