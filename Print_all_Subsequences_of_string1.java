import java.util.HashSet;

public class Print_all_Subsequences_of_string1 {
    static HashSet<String> s=new HashSet<>();
    static void subsequences(String str,int index,String newstring){
        if(index==str.length()){
            if(s.contains(newstring)) {
                return;

            }
            else {
                s.add(newstring);
                System.out.println(newstring);
                return;
            }
        }
        subsequences(str,index+1,newstring+str.charAt(index));
        subsequences(str,index+1,newstring);
    }
    public static void main(String[] args) {
        subsequences("aaa",0,"");
    }
}

