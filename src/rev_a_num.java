import java.util.Scanner;
import java.util.*;
public class rev_a_num {
    public static void rev(int n){
        String s=String.valueOf(n);
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        rev(n);
    }
}
