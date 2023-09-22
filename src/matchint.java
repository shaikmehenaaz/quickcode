import java.util.Arrays;
import java.util.Scanner;
public class matchint {
    static void match(int[] arr){
        int max=arr[0];
        int min=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        int[] sum=new int[max-min+1];
        for(int i:arr){
            sum[i-min]++;
        }
        for(int i=0;i< sum.length;i++){
            if(sum[i]>0){
                System.out.print(i+min);
                System.out.print(":");
                System.out.print(sum[i]);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int n = sc.nextInt();
        System.out.println();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        match(arr);
    }
}
