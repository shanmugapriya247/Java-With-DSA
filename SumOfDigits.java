public class SumOfDigits {

    static int sum(int n) {
        if (n == 0)      // Base case
            return 0;

        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(sum(num));
    }
}