public class EvenIndicesDes&OddIndicesAsc {

    public static void main(String[] args) {

        int[] arr = {9, 4, 7, 2, 8, 1, 6, 3};

        // Even indices - Descending
        for (int i = 0; i < arr.length; i += 2) {
            for (int j = i + 2; j < arr.length; j += 2) {

                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Odd indices - Ascending
        for (int i = 1; i < arr.length; i += 2) {
            int min = i;

            for (int j = i + 2; j < arr.length; j += 2) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}