import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 27;

        // Sort the array
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(left + " " + right);
                found = true;
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("-1 -1");
        }
    }
}