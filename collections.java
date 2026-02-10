import java.util.*;
public class collections{
    void solvequery(ArrayList<Integer> A, String[] queries){
        for(String query:queries){
            String[] parts= query.split(" ");
            char type = parts[0].charAt(0);

            switch (type){
                case 'a':
                    int x = Integer.parseInt(parts[1]);
                    A.add(x);
                    break;
                case 'b':
                    Collections.sort(A);
                    break;
                case 'c':
                    Collections.sort(A,Collections.reverseOrder());
                    break;
                case 'd':
                    for(int num:A){
                        System.out.println(num);
                    }
        }

        }

    }
    public static void main(String args[]){

        ArrayList<Integer> arrays = new ArrayList<>();
        String[] myquery = {"a 4 , a 5, a 6, b, c,d"};
        collections c1 = new collections();
        c1.solvequery(arrays,myquery);

    }
}