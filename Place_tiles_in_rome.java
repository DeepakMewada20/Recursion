public class Place_tiles_in_rome {
    //first way to find, how many types to arrange (1*m size) tiles in (n*m size) room.
    static int placetiles(int row,int coloum){
        if(row==0){
            return 1;
        }
        int a=0;
        if (row>=coloum) {
            a= placetiles(row - coloum, coloum);
        }
         int b= placetiles(row - 1, coloum);
        return a+b;
    }
    //second way to find, how many types to arrange (1*m size) tiles in (n*m size) room.
    static  int placetiles2(int row,int coloum){
        if(row==0){
            return 1;
        }
        if(row>=coloum){
            return placetiles2(row-coloum,coloum)+placetiles2(row-1,coloum);
        }
        else {
            return placetiles2(row-1,coloum);
        }
    }
    //thread way to find, how many types to arrange (1*m size) tiles in (n*m size) room.
    static int placetiles3(int row,int coloum){
        if(row==coloum){
            return 2;
        }
        if(row<coloum){
            return 1;
        }
        //horizontal place
        int horizontal=placetiles3(row-coloum,coloum);
        int vertical=placetiles3(row-1,coloum);
        return horizontal+vertical;
    }
    public static void main(String[] args) {
        //first way
        System.out.println(placetiles(4,2));

        //second way
        System.out.println(placetiles2(5,2));

        //thread way
        System.out.println(placetiles3(5,2));
    }
}
