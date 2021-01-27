import java.util.*;

public class outer_parantheses {
    public static void main(String[] args) {
        String input = "(()())(())(()(()))";
        String output = remove_parantheses(input);

        System.out.println(output);
    }

    public static String remove_parantheses(String input) {
        char[] in = input.toCharArray();
        int depth = 0;

        for (int i = 0; i < in.length; i++) {
            char c = in[i];

            if (c == '(') {
                depth++;
                if (depth == 1) {
                    in[i] = ' ';
                }
            }

            if (c == ')') {
                if (depth == 1) {
                    in[i] = ' ';
                }
                depth--;
            }
        }

        String done = new String(in);
        done = done.replaceAll(" ", "");

        return done;

    }
}
