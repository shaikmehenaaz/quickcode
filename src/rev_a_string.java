import java.util.Scanner;

public class rev_a_string {

    public static void reverse(String s){
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        String s=sc.nextLine();
        reverse(s);
    }
}
