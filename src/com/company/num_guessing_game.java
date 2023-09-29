package com.company;


import java.util.Random;
import java.util.Scanner;

class game{
    public int number;
    public int inputnumber;
    public int noofGuesses=0;
    public void setNoofGuesses(int noofGuesses){
        this.noofGuesses=noofGuesses;
    }
    public int getNoofGuesses(){
        return noofGuesses;
    }

    game(){
        Random rd=new Random();
        this.number=rd.nextInt(100);
    }
    void userinput(){
        System.out.println("guess the number: ");
        Scanner sc=new Scanner(System.in);
        this.inputnumber=sc.nextInt();
    }
    boolean iscorrect(){
        noofGuesses++;
        if(inputnumber==number){
            System.out.println("right guess, you guesses it in %d guesses "+noofGuesses);
            return true;
        }
        else if(inputnumber<number){
            System.out.println("too small..");
        }
        else if(inputnumber>number){
            System.out.println("too big..");
        }
        return false;
    }
}
public class num_guessing_game {
    public static void main(String[] args) {
        game g=new game();
        boolean b = false;
        while(!b) {
            g.userinput();
            b=g.iscorrect();
            System.out.println(b);
        }
    }
}
