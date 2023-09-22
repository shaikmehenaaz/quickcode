import java.util.Arrays;
import java.util.Scanner;

public class missing_num_in_seq {
    public static void missing(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]!=arr[i]+1){
                System.out.println(arr[i]+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,4,5};
        missing(arr);
    }
}
