import java.util.Scanner;

public class palindrome_String {
    public static void palind(String s) {
        String S="";
        for(int i=s.length()-1;i>=0;i--){
            S=S+s.charAt(i);
        }
        if(s.equalsIgnoreCase(S)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        String s=sc.nextLine();
        palind(s);
    }
}
