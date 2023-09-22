import java.util.Scanner;

public class largest_of_3 {
    public static void largest(String[] s) {
        int first=Integer.parseInt(s[0]);
        int second=Integer.parseInt(s[1]);
        int third=Integer.parseInt(s[2]);
        if(first>second & second>third){
            System.out.println(first+" is the largest");
        }else if(second>third & third>first){
            System.out.println(second+" is the largest");
        }else{
            System.out.println(third+" is the largest");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String[] s=n.split(" ");
        largest(s);
    }
}
