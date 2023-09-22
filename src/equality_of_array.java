import java.util.Arrays;
import java.util.Scanner;

public class equality_of_array {
    public static void equal(String[] arr1, String[] arr2){
        if(arr1.length==arr2.length){
            int count=0;
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    count++;
                }
            }
            if(count>0){
                System.out.println("not equal");
            }else{
                System.out.println("equal");
            }
        }
    }
    public static void equall(String [] arr1,String[] arr2){
        if(Arrays.equals(arr1,arr2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] arr1={"1","3","3"};
        String[] arr2={"1","2","3"};
        equal(arr1,arr2);
        equall(arr1,arr2);
    }
}
