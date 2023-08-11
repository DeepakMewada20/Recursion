import java.awt.*;

public class Sub_sequences {
    static void subsequenc(String str, String newstring, int index) {
        if (index == str.length()) {
            System.out.println(newstring);
            return;
        }
        subsequenc(str, newstring + str.charAt(index), index + 1);
        subsequenc(str, newstring, index + 1);
    }
    public static void main (String[] args){
        subsequenc("abc","",0);
    }
}
