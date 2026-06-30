import java.util.*;

public class RemoveDigitFromString {
    public static void main(String[] args) {

        String str = "he627l987lo";

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                s.push(ch);
            }
        }

        System.out.print("Letters: ");

        for (char c : s) {
            System.out.print(c);
        }
    }
}


/*
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String str = "he627l987lo";

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!Character.isDigit(ch)) {
                s.push(ch);
            }
        }

        System.out.print("Letters: ");

        for (char c : s) {
            System.out.print(c);
        }
    }
}
*/