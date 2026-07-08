public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 3, 8, 4};
        for (int i = 0; i < arr.length; i++) {
            int nextGreater = -1;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    nextGreater = arr[j];
                    break; // First greater element found
                }
            }
            System.out.print(nextGreater + " ");
        }
    }
}