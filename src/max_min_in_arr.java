import java.util.Arrays;
import java.util.Scanner;

public class max_min_in_arr {
    public static void max_min(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max: "+max);
        int min=max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("min: "+min);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3};
        System.out.println(Arrays.toString(arr));
        max_min(arr);
    }
}
