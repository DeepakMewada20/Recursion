public class Invite_n_pepule_in_parti_single_or_pire {
    static long numberofway(int n){
        if (n==2){
            return 2;
        }
        if (n==1){
            return 1;
        }
        return numberofway(n-1)+(n-1)*numberofway(n-2);
    }
    public static void main(String[] args) {
        System.out.println(numberofway(60));
    }
}
