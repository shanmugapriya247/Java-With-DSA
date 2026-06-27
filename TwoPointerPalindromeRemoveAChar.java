public class TwoPointerPalindromeRemoveChar {

    public static void main(String[] args) {

        String str = "madabm";

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {

                // Remove left character
                String s1 = str.substring(left + 1, right + 1);

                // Remove right character
                String s2 = str.substring(left, right);

                if (checkPalindrome(s1) || checkPalindrome(s2)) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }
                return;
            }
        }

        System.out.println(true);
    }

    public static boolean checkPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}


//meth2
public class ValidPalindrome {

    public static void main(String[] args) {

        String str = "madabm";

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {

                // Remove left character
                String s = str.substring(left + 1, right + 1);

                String rev = "";
                for (int i = s.length() - 1; i >= 0; i--) {
                    rev = rev + s.charAt(i);
                }

                if (s.equals(rev)) {
                    System.out.println(true);
                } else {
                    System.out.println(false);
                }

                return;
            }
        }

        System.out.println(true);
    }
}