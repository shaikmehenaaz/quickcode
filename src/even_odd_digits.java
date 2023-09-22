import java.util.Scanner;

public class even_odd_digits {
    public static void even(int n) {
        String s_eve=String.valueOf(n);
        int even_count=0;
        for(int i=0;i<s_eve.length();i++){
            if(s_eve.charAt(i)%2==0){
                even_count+=1;
            }
        }
        System.out.println("even : "+even_count);
    }
    public static void odd(int n) {
        String s_eve=String.valueOf(n);
        int odd_count=0;
        for(int i=0;i<s_eve.length();i++){
            if(s_eve.charAt(i)%2!=0){
                odd_count+=1;
            }
        }
        System.out.println("odd : "+odd_count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        even(n);
        odd(n);
    }
}
