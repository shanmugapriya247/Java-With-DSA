import java.util.*;

public class MinMaxHeap {
    public static void main(String[] args) {

        // Min Heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.add(30);
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(40);

        System.out.println("Min Heap:");

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }

        System.out.println();

        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(40);

        System.out.println("Max Heap:");

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}