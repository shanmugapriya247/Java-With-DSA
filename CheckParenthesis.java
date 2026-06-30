import java.util.*;

public class CheckParenthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brackets: ");
        String str = sc.nextLine();

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                s.push(ch);
            } 
            else {

                if (s.isEmpty()) {
                    System.out.println(false);
                    return;
                }

                if (s.peek() == '(' && ch == ')') {
                    s.pop();
                }
                else if (s.peek() == '{' && ch == '}') {
                    s.pop();
                }
                else if (s.peek() == '[' && ch == ']') {
                    s.pop();
                }
                else {
                    System.out.println(false);
                    return;
                }
            }
        }

        if (s.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}