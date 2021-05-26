import java.util.*;

public class parenDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }

    public static int maxDepth(String s) {
        int depth = 0;
        int max = 0;
        char[] sChar = s.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] == '(') {

                depth++;
                if (depth > max) {
                    max = depth;
                }
            }
            if (sChar[i] == ')') {

                depth--;
            }
        }

        return max;
    }
}
