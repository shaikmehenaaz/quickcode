import java.util.*;
public class quque_using_stack {
    public static void main(String[] args) {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        //1,2,3,4,5
        for(int i=1;i<=5;i++) {
            if (s1.isEmpty()) {
                s1.add(i);
                while (!s1.isEmpty()) {
                    s1.peek();
                    s2.add(s1.pop());
                }
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        for(int i=1;i<=5;i++) {
            s2.peek();
            s1.add(s2.pop());
        }
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
    }
}
