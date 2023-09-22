import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void facto(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        System.out.println(fact(n));
        facto(n);
    }
}
