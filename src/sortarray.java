import java.util.*;
public class sortarray {
    static void sortarr(int[] arr){
        Arrays.sort(arr);
        for(int n:arr){
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sortarr(arr);
    }
}
