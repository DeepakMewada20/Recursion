public class Print_x_power_n_using_recorsion {
    public static int print1(int x,int n){
        if(n/2==0){

        }
        return 0;
    }
    static int print(int x,int n){
        if(x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        return x*print(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(print(2,9));
        System.out.println(Math.pow(4,5));
    }
}
