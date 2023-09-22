import java.util.Scanner;

public class numbers {

    static void nums(String s){
        int count = 0;
        int l=s.length();
        for(int i=0;i<l;i++){
            char a =s.charAt(i);
            if (a == '1' || a == '2' || a == '3' || a == '4' || a == '5' || a == '6' || a == '7' || a == '8' || a == '9' || a == '0')
                count += 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        String s=sc.nextLine();
        nums(s);
    }
}
