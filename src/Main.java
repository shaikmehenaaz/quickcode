import java.util.*;

public class Main {

    static void reverse(String s){
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        String string=sc.nextLine();
        reverse(string);
    }
}