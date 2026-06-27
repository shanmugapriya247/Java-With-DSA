public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//with two pointer
public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};

        int left = 0;   // Slow pointer
        int right = 1;  // Fast pointer

        while (right < arr.length) {

            if (arr[left] != arr[right]) {
                left++;
                arr[left] = arr[right];
            }

            right++;
        }

    
        for (int i = 0; i <= left; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}