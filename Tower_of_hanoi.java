public class Tower_of_hanoi {
    static void towerofhanoi(int n,String scr,String helper,String dest){
        if (n==1){
            System.out.println("Transfer to disk "+n+" from "+scr+" to "+dest);
            return;
        }
        towerofhanoi(n-1,scr,dest,helper);
        System.out.println("Transfer to disk "+n+" from "+scr+" to "+dest);
        towerofhanoi(n-1,helper,scr,dest);
    }
    public static void main(String[] args) {
        towerofhanoi(3,"S","H","D");
    }
}
