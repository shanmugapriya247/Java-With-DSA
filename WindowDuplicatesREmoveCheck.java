import java.util.HashSet;

public class WindowDuplicatesREmoveCheck {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 5, 6};
        int k = 3;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            // check only last k elements
            if (set.contains(arr[i])) {
                System.out.println(true);
                return;
            }

            set.add(arr[i]);

            // maintain window size k
            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }

        System.out.println(false);
    }
}
