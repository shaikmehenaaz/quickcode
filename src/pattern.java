import java.util.Scanner;
public class pattern {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        pattern(n+1);
        pattern2(n);
    }
}
