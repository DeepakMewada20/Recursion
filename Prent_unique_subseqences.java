import java.util.HashSet;

public class Prent_unique_subseqences {
    static void uniquesubseqence(String str, String newstring, int index, HashSet<String> set){
        if(index==str.length()){
            if(set.contains(newstring)){
                return;
            }
            else {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        uniquesubseqence(str,newstring+str.charAt(index),index+1,set);
        uniquesubseqence(str,newstring,index+1,set);
    }
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        uniquesubseqence("aaa","",0,set);
    }
}
