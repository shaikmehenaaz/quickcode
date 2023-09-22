import java.util.*;
import java.util.Scanner;

public class swap_nums {
    static void swap(String[] a){
        String x,y,t;
        x=a[0];
        y=a[1];
        t=x;
        x=y;
        y=t;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String n=sc.nextLine();
        String[] a=n.split(" ");
        swap(a);
    }
}
