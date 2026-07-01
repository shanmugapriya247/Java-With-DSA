import java.util.*;

public class PriorityQueueOperations {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Offer
        pq.offer(40);

        System.out.println("Priority Queue : " + pq);

        // Peek
        System.out.println("Peek : " + pq.peek());

        // Element
        System.out.println("Element : " + pq.element());

        // Poll
        System.out.println("Poll : " + pq.poll());
        System.out.println("After Poll : " + pq);

        // Remove
        System.out.println("Remove : " + pq.remove());
        System.out.println("After Remove : " + pq);

        // Size
        System.out.println("Size : " + pq.size());

        // isEmpty
        System.out.println("Is Empty : " + pq.isEmpty());
    }
}