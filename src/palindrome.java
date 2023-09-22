import java.util.*;

public class palindrome {

    static void reverse(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        //System.out.println(reversed);
        if(s.equals(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        String string=sc.nextLine();
        reverse(string);
    }
}