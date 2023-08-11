import java.util.ArrayList;

public class Remove_duplicet_value_in_string {
     static ArrayList<Character> chars=new ArrayList<>();
    static boolean check(char c,int index){
        if(index==chars.size()){
            return true;
        }
        if(c!=chars.get(index)) {
            return check(c,index+1);
        }
        else {
            return false;
        }
    }
    static void removeduplicatvaalue(String str,int index){
        if (index==str.length()){
            return;
        }
        if (check(str.charAt(index),0)){
            System.out.print(str.charAt(index));
            chars.add(str.charAt(index));
            removeduplicatvaalue(str,index+1);
        }
        else {
            removeduplicatvaalue(str,index+1);
        }
    }
    public static void main(String[] args) {
        String str="deepakmewada";
        removeduplicatvaalue(str,0);
      
    }
}
