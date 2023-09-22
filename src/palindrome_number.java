import java.util.Scanner;

public class palindrome_number {
    public static void palind(int n) {
         String s="";
         String num=String.valueOf(n);
         for(int i=num.length()-1;i>=0;i--){
             s=s+num.charAt(i);
         }
         if(s.equalsIgnoreCase(num)){
             System.out.println("palindrome");
         }else{
             System.out.println("not palindrome");
         }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        palind(n);
    }
}
