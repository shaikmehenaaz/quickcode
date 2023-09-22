import java.util.*;
public class maxele {

    static void maxele(int[] arr){
        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
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
        maxele(arr);
    }
}
