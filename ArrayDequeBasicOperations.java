import java.util.*;

public class ArrayDequeBasicOperations {
    public static void main(String[] args) {

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        // Add Operations
        dq.add(20);
        dq.addFirst(10);
        dq.addLast(30);
        dq.offerFirst(5);
        dq.offerLast(40);

        System.out.println("Deque : " + dq);

        // Get Operations
        System.out.println("Get First : " + dq.getFirst());
        System.out.println("Get Last : " + dq.getLast());

        // Peek Operations
        System.out.println("Peek First : " + dq.peekFirst());
        System.out.println("Peek Last : " + dq.peekLast());
        System.out.println("Peek : " + dq.peek());

        // Remove Operations
        System.out.println("Remove First : " + dq.removeFirst());
        System.out.println("Remove Last : " + dq.removeLast());
        System.out.println("Remove : " + dq.remove());

        System.out.println("Deque : " + dq);

        // Poll Operations
        System.out.println("Poll First : " + dq.pollFirst());
        System.out.println("Poll Last : " + dq.pollLast());

        System.out.println("Deque : " + dq);

        // Size
        System.out.println("Size : " + dq.size());

        // isEmpty
        System.out.println("Is Empty : " + dq.isEmpty());
    }
}