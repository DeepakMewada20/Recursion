public class Reverse_string {
    static void reverse(int charat,String name){
        if(charat==0){
            System.out.print(name.charAt(charat));
            return;
        }
        reverse(charat-1,name);
        if(charat==name.length()-1){
            System.out.println(name.charAt(charat));
        }
    }
    public static void main(String[] args) {
        String name="Deepak";
        reverse(name.length()-1,name);
    }
}
