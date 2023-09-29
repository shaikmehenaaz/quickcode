import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("0 for rock, 1 for paper, 2 for scissors : ");
        int UI = sc.nextInt();

        int CI = rd.nextInt(3);

        if (UI == CI) {
            System.out.println("comp chose: "+CI);
            System.out.println("draw");
        } else if (UI==0 && CI==2 || UI==1 && CI==0 || UI==2 && CI==1) {
            System.out.println("comp chose: "+CI);
            System.out.println("you win");
        }else{
            System.out.println("comp chose: "+CI);
            System.out.println("comp win");
        }
    }
}
