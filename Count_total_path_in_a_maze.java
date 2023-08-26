public class Count_total_path_in_a_maze {
    static int mazepath(int row,int coloum,int trow,int tcoloum){
        if((row==trow)&&(coloum==tcoloum)){
            return 1;
        }
        if ((trow<row)&&(tcoloum<coloum)){
            return mazepath(row,coloum,trow,tcoloum+1)+mazepath(row,coloum,trow+1,tcoloum);
        }
        if(row==trow){
            return mazepath(row,coloum,trow,tcoloum+1);
        }
        else {
            return mazepath(row,coloum,trow+1,tcoloum);
        }
    }
    public static void main(String[] args) {
        int count=mazepath(1,1,0,0);
        System.out.println(count);
    }
}
