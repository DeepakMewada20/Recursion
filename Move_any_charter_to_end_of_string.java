public class Move_any_charter_to_end_of_string {
    public static String move_charter_to_end(String str,int index){
        if(index==str.length()-1){
            return str.charAt(index)+"";
        }
        if (str.charAt(index)=='x'){
            return move_charter_to_end(str,index+1)+str.charAt(index);
        }
        else {
            return str.charAt(index)+move_charter_to_end(str,index+1);
        }
    }
    public static void main(String[] args) {
        String name="dxeexpxaxk";
        System.out.println(move_charter_to_end(name,0));

    }
}
