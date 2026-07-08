public class AddNumbersAsItIs {

    public static void main(String[] args) {

        String str = "ab12cd34ef5";

        int sum = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {

                num = num * 10 + (ch - '0');

            } else {

                sum = sum + num;
                num = 0;
            }
        }

        // Add the last number if string ends with a digit
        sum = sum + num;

        System.out.println("Sum = " + sum);
    }
}