import java.util.*;

public class ContinuousDigitPopIfNotPrint {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();          // Continuous duplicate -> remove
            } else {
                stack.push(ch);       // Different character -> push
            }
        }

        System.out.print("Output: ");
        for (char c : stack) {
            System.out.print(c);
        }
    }
}