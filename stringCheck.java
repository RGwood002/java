import java.util.*;

public class stringCheck {
    public static String StringChecker(String str) {
        String bool = "";
        boolean testing = true;
        StringTokenizer st = new StringTokenizer(str, ".");
        String[] token = new String[3];
        for (int i = 0; i < token.length; i++) {
            token[i] = st.nextToken();
            // checks if there are 3 digits
            if (token[i].length() == 3) {

                if (i == 0) {
                    if (!isValidOne(token[i])) {
                        testing = false;
                        break;
                    }
                }
                if (i == 1) {
                    if (!isValidTwo(token[i])) {
                        testing = false;
                        break;
                    }

                }

                if (!isValidThree(token[i])) {
                    testing = false;
                    break;
                }

            } else {
                testing = false;
                break;
            }
        }
        System.out.println(Arrays.toString(token));

        if (testing == true) {
            bool = "true";
        }
        if (testing == false) {
            bool = "false";
        }
        return bool;
    }

    public static boolean isValidOne(String s) {
        int sum = 0;
        boolean valid = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        if (sum % 2 == 0) {
            valid = true;
        }

        return valid;

    }

    public static boolean isValidTwo(String s) {
        int sum = 0;
        boolean valid = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }

        if (sum % 2 == 1) {
            valid = true;
        }

        return valid;
    }

    public static boolean isValidThree(String s) {
        boolean valid = false;
        int firstDigit = s.charAt(0);
        int secondDigit = s.charAt(1);
        int lastDigit = s.charAt(2);

        if ((lastDigit > firstDigit) && (lastDigit > secondDigit)) {
            valid = true;
        }

        return valid;
    }

    public static void main(String[] args) {
        String test = "114.568.112";
        System.out.println(StringChecker(test));
    }
}
