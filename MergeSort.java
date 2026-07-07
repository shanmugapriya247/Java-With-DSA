public class Main {

    static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);       // Left half
            mergeSort(arr, mid + 1, high);  // Right half

            merge(arr, low, mid, high);     // Merge
        }
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int left = low;
        int right = mid + 1;

        int[] temp = new int[high - low + 1];
        int index = 0;

        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left];
                left++;
            } else {
                temp[index++] = arr[right];
                right++;
            }
        }

        while (left <= mid) {
            temp[index++] = arr[left];
            left++;
        }

        while (right <= high) {
            temp[index++] = arr[right];
            right++;
        }

        int j = 0;

        for (int i = low; i <= high; i++) {
            arr[i] = temp[j++];
        }
    }

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}