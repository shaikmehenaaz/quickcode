import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ifelse {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        int n = sc.nextInt();

        if(n%2==0){
            if(2<=n && n<=5){
                System.out.print("Not weird");
            }
            if(6<=n && n<=20){
                System.out.print("Weird");
            }
            if(n>20){
                System.out.print("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }

    }
}
