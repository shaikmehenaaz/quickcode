import java.util.Scanner;

public class sum_of_digits {
    public static void sum(int n) {
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        sum(n);
    }
}
