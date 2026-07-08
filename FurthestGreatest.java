public class FurthestGreatest{
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 3, 8, 4};
        for (int i = 0; i < arr.length; i++) {
            int furthestGreater = -1;
            // Check all elements on the right
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    furthestGreater = arr[j];
                }
            }
            System.out.print(furthestGreater + " ");
        }
    }
}