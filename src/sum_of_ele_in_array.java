import java.util.Scanner;

public class sum_of_ele_in_array {
    public static void sum(String[] S){
        int summ=0;
        for(int i=0;i<S.length;i++){
            summ += Integer.parseInt(S[i]);
        }
        System.out.println(summ);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        String S[]=s.split(" ");
        sum(S);
    }
}
