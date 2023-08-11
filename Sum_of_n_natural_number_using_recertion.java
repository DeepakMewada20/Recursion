public class Sum_of_n_natural_number_using_recertion {
    static void sum(int n,int i,int sum){
        if(i==n+1){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        //System.out.println(sum);
        sum(n,i+1,sum);
    }

    public static void main(String[] args) {
        sum(10,1,0);
        System.out.println((50*(50+1))/2);
    }
}
