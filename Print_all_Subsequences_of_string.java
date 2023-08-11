import java.util.ArrayList;

public class Print_all_Subsequences_of_string {
    static ArrayList<String> s=new ArrayList<>();
    static boolean check1(String str1,int index){
        if(index==s.size()){
            return true;
        }
        if(str1==s.get(index)) {
            return false;
        }
        else {
            System.out.println(s.get(index));
            System.out.println(index);
            return check1(str1,index+1);
        }
    }
    static void subsequences(String str,int index,String news){
        if(index==str.length()){
            if(check1(news,0)) {
                s.add(news);
                System.out.println(" crect = "+news);
            }
            return;
        }
        subsequences(str,index+1,news+str.charAt(index));
        subsequences(str,index+1,news);
    }
    public static void main(String[] args) {
        subsequences("aaa",0,"");
    }
}

