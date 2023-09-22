import java.util.Scanner;

public class prime_or_not {
    public static void prime(int n) {
       int count=0;
       for(int i=2;i<n-1;i++){
           if(n%i==0){
               count++;
           }
       }
       if(count>0){
           System.out.println("not prime");
       }else{
           System.out.println("prime");
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        prime(n);
    }
}
