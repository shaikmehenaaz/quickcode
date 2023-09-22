import java.util.Scanner;

public class charac {

    static void nums(String s,char ch){
        int count = 0;
        int l=s.length();
        for(int i=0;i<l;i++){
            char a =s.charAt(i);
            if (a == ch)
                count += 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        String s=sc.nextLine();
        System.out.println();
        char ch = sc.next().charAt(0);
        nums(s,ch);
    }
}
