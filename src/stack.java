import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        for(int i=1;i<=10;i++){
            s.push(i);
        }
        /*s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.isEmpty());
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.isEmpty());*/
        System.out.println(s);
        s.pop();
        s.pop();
        System.out.println(s);
        s.pop();
        s.push(2);
        s.removeAllElements();
        System.out.println(s);
    }
}
