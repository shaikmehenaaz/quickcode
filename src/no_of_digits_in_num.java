import java.util.Scanner;

public class no_of_digits_in_num {
    public static void num(int n) {
        String numb=String.valueOf(n);
        System.out.println(numb.length());
    }
    public static void nums(int n) {
        int i=0;
        while(n!=0){
            n=n/10;
            i++;
        }
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        num(n);
        nums(n);
    }
}
