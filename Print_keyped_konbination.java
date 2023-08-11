public class Print_keyped_konbination {
    public static String[] keyped={".","abc","def","ghi","jkl","mno","purs","tu","vwx","yz"};
    static void printcombinasion(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currentchar =str.charAt(index);
        String mapping=keyped[currentchar-'0'];
        for (int i=0;i<mapping.length();i++){
            printcombinasion(str,index+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        printcombinasion("23",0,"");
    }
}
