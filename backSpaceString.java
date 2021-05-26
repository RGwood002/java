import java.util.*;

public class backSpaceString {
    public static void main(String[] args) {
        String s = "ab##";
        String c = "a#";

        System.out.println(backSpace(s, c));
    }

    public static boolean backSpace(String s, String c) {
        boolean eq = false;

        Stack<Character> sStack = new Stack<Character>();
        Stack<Character> cStack = new Stack<Character>();

        char[] sChar = s.toCharArray();
        char[] cChar = c.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] == '#') {
                if (!sStack.empty()) {
                    sStack.pop();
                }
            } else {
                sStack.push(sChar[i]);
            }
        }
        System.out.println(sStack.toString());

        for (int i = 0; i < cChar.length; i++) {
            if (cChar[i] == '#') {
                if (!cStack.empty()) {
                    cStack.pop();
                }
            } else {
                cStack.push(cChar[i]);
            }
        }

        if (sStack.toString().equals(cStack.toString())) {
            eq = true;
        }

        return eq;
    }
}