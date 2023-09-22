
import java.util.*;
public class nmchars {

    static void nmchar(String s1,String s2){
        char[] arr1= s1.toCharArray();
        char[] arr2= s2.toCharArray();
        //char[] arr3= {};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    char[] arr3={(arr1[i])};
                    System.out.println(arr3);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        String s1=sc.nextLine();
        System.out.println();
        String s2=sc.nextLine();
        nmchar(s1,s2);
    }
}
