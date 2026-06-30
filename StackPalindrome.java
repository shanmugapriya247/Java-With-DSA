import java.util.*;

public class StackPalindrome{
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        boolean palindrome = true;

        // Compare original string with popped characters
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != stack.pop()) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}