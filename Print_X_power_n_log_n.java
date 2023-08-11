public class Print_X_power_n_log_n {
    static long print(int x,int n){
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if(n%2==0){
            return print(x,n/2)*print(x,n/2);
        }
        else {
            return x*print(x,n/2)*print(x,n/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(print(3, 84));
    }
}
