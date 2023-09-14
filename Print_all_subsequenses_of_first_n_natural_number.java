import java.lang.String;
import java.util.ArrayList;

public class Print_all_subsequenses_of_first_n_natural_number {
    static void sub_sequenses(int n, ArrayList<Integer> subset){
        if (n==0){
            System.out.println(subset);
            return;
        }
        //with number
        subset.add(n);
        sub_sequenses(n-1,subset);

        // without number, remove number in Arraylist
        subset.remove(subset.size()-1);
        sub_sequenses(n-1,subset);
    }
    public static void main(String[] args) {
        ArrayList<Integer> subset=new ArrayList<>();
        sub_sequenses(3,subset);
    }
}
