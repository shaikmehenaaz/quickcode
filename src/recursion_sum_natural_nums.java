import java.util.Scanner;

public class recursion_sum_natural_nums {
    public static int sum(int n){
        if(n==1)
            return 1;
        else
            return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
}
