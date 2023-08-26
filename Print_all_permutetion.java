import java.lang.String;

public class Print_all_permutetion{
    static void permutetion(String str,String permutetion){
        if(str.isEmpty()){
            System.out.println(permutetion);
            return;
        }
        for (int i=0;i<str.length();i++){
            char currentchar=str.charAt(i);
            String newstring=str.substring(0,i)+str.substring(i+1);
            permutetion(newstring,permutetion+currentchar);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        permutetion(s,"");
    }
}