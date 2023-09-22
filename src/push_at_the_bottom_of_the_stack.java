
import java.util.*;
public class push_at_the_bottom_of_the_stack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        for(int i=1;i<=3;i++) {
            s1.add(i);
        }
        System.out.println(s1);
        for(int i=1;i<=3;i++) {
            s1.peek();
            s2.add(s1.pop());
        }
        System.out.println(s2);
        s1.add(4);
        for(int i=1;i<=3;i++) {
            s2.peek();
            s1.add(s2.pop());
        }
        System.out.println(s1);
    }
}
