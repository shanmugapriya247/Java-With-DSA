import java.util.*;

/*public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 10};
        int element = 3;
        int pos = 2;

        int[] newArr = new int[arr.length + 1];

// Copy elements before the position
        for (int i = 0; i < pos; i++) {
        newArr[i] = arr[i];
}

// Insert the new element
        newArr[pos] = element;

// Copy remaining elements
        for (int i = pos; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
    }
}
*/
public class InsertKAtSpecificPos {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 7, 10};
        int target = 8;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(left); // Insert position
    }
}