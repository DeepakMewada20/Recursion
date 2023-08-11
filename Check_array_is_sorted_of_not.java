public class Check_array_is_sorted_of_not {
    static boolean check_array(int[] arr,int index){
        if((index==arr.length-1)) {
            return true;
        }
        if(arr[index]<=arr[index+1]){
            return check_array(arr,index+1);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,5,7,8,9};
        System.out.println(check_array(arr,0));
    }
}
