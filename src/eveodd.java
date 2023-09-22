import java.util.*;
public class eveodd {

    static void eveod(int n){
        if(n%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        int n=sc.nextInt();
        eveod(n);
    }
}
