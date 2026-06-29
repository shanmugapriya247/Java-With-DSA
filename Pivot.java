import java.util.*;
class Pivot {
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {1, 4, 5, 8, 7, 3};
        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            totalsum += arr[i];
        }
        int leftsum = 0;
        for (int i = 0; i < n; i++) {
            int rightsum = totalsum - leftsum - arr[i];

            if (leftsum == rightsum) {
                System.out.println("Equilibrium Index: " + i);
                return;
            }
            leftsum += arr[i];
        }
        System.out.println("No Equilibrium Index");
    }
}