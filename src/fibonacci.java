import java.util.*;
public class fibonacci {
    static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
}
