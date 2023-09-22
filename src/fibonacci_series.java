import java.util.Scanner;

public class fibonacci_series {
    public static void fib(int i){
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for(int n=0;n<i;n++){
            int next=a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int i=sc.nextInt();
        fib(i);
    }
}


