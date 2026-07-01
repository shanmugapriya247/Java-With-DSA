import java.util.*;

public class K3MeansReverseLikeThat {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        int k = 3;

        // First k elements -> Stack
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        // Stack -> Queue
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }

        // Remaining elements move to back
        for (int i = 0; i < q.size() - k; i++) {
            q.offer(q.poll());
        }

        System.out.println(q);
    }
}