public class Recertion {
    static void print_number(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print_number(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print_number(5);
    }
}
