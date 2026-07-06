public class FindPeak {
    public static void main(String[] args) {

        int[] arr = {12, 15, 17, 20, 2, 5, 7, 9};

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            // Check if mid is the peak
            if (arr[mid ]> arr[mid-1]&& arr[mid] > arr[mid + 1]) {
                System.out.println("Peak element = " + arr[mid]);
                System.out.println("Index = " + mid);
                return;
            }

            // Decide which half to search
            if (arr[mid ]> arr[mid-1]&& arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
