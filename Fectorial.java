
public class Fectorial {
    static int fectorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fec=fectorial(n-1);
        int fec_n=fec*n;
        return fec_n;
    }
    public static void main(String[] args) {
        System.out.println(fectorial(5));
    }
}
