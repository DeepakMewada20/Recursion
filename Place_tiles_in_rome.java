public class Place_tiles_in_rome {
    static int count=0;
    static int placetiles(int row,int coloum){
        if(row==0){
            return 1;
        }
        int a=0;
        if (row>=coloum) {
            a= placetiles(row - coloum, coloum);
            System.out.println(a);
        }
         int b= placetiles(row - 1, coloum);
        System.out.println(b);
        return a+b;
    }

    public static void main(String[] args) {
        int c= placetiles(4,2);
        System.out.println(c);
    }
}
