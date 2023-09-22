import java.util.Scanner;
public class even_odd_in_array {
    public static void even(int[] arr){
        System.out.println("even");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void odd(int[] arr){
        System.out.println("odd");
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.println(arr[i]);
            }
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
        even(arr);
        odd(arr);
    }
}
