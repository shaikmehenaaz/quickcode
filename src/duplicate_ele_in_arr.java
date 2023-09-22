import java.util.Arrays;

public class duplicate_ele_in_arr {
    public static void dupli(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,5,2,6,4,5,6};
        dupli(arr);
    }
}
