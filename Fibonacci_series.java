public class Fibonacci_series {
    static void fibonaci(int n,int first,int second){
        if(n==0){
            return;
        }
        int sum=first+second;
        System.out.print(","+sum);
        fibonaci(n-1,second,sum);
    }
    public static void main(String[] args) {
        System.out.print("0,1");
        int n=7;
        fibonaci(n-2,0,1);
    }
}
