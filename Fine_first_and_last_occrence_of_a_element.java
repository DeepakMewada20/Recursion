public class Fine_first_and_last_occrence_of_a_element {
    static int first=-1;
    static int last=-1;
    int i=0;
    static void find_occrence(int index,String name,char worad){
        if(name.charAt(index)==worad){
            if (first==-1){
                first=index;
            }
            last=index;
        }
        if (index==name.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        find_occrence(index+1,name,worad);
    }
    public static void main(String[] args) {
        String name="kfsaklfjkakfjalk";
        find_occrence(0,name,'a');
        System.out.println(first);
        System.out.println(last);
    }
}
