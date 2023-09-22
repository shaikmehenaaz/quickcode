import java.util.*;
public class rev_str_using_stack {
    static void reverse(Stack<String> s){
        System.out.println(s);
        String s1=s.get(0);
        System.out.println(s1);
        char[] arr=s1.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("Mehenaaz");
        reverse(s);
    }
}
