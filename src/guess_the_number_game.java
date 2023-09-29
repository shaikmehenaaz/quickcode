import java.util.Scanner;
import java.util.Random;

public class guess_the_number_game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int CI=rd.nextInt(51);

        System.out.println("You have five chances \nGuess the number in between 0 to 50");
        int k=5;
        while(k>0){
            System.out.print("guess the number: ");
            int num=sc.nextInt();
            if(num==CI){
                System.out.println("You guessed it right");
                break;
            }else if(num>CI){
                System.out.println("the number you guessed is greater than actual number, Try again");
            }else{
                System.out.println("the number you guessed is smaller than the actual number, try again");
            }
            k--;
        }
        if(k==0){
            System.out.println("you are out of chances");
            System.out.println("the actual number is: "+CI);
        }
    }
}
