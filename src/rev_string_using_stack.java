import java.util.*;
import java.lang.*;

public class rev_string_using_stack {
    public static void rev(String str){
        char[] arr=new char[str.length()];
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        System.out.println(s);
        int i=0;
        while(!s.isEmpty()){
            arr[i]=s.pop();
            i++;
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        String str="mehenaaz";
        rev(str);
    }
}
