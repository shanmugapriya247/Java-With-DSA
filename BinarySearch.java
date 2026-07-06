import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 10}; // Sorted array
        int target = 3;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Not found");
    }
}