import java.util.*;
public class queue {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
        System.out.println(q.add(6));
        System.out.println(q);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q);
    }
}
