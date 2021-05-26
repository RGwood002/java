import java.util.*;

public class stringCompression {
    public static void main(String[] args) {
        String test = "a";

        System.out.println(compressed(test));

    }

    public static String compressed(String test) {
        StringBuilder fin = new StringBuilder();
        char curChar = test.charAt(0);
        int count = 0;

        for (int i = 0; i < test.length(); i++) {
            if (curChar == test.charAt(i)) {
                count++;
            } else {
                fin.append(curChar);
                fin.append(count);
                curChar = test.charAt(i);
                count = 1;
            }

        }

        fin.append(curChar);
        fin.append(count);

        return fin.toString();
    }
}
