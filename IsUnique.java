import java.util.*;

//implement a string that has all unique characters
public class IsUnique {
    public static void main(String[] args) {
        String test = "Hello";
        String test2 = "Ryan";

        System.out.println(isUnique(test));
        System.out.println(isUnique(test2));

    }

    public static boolean isUnique(String example) {
        boolean u = true;
        Hashtable<Character, Boolean> checker = new Hashtable<Character, Boolean>(example.length());

        for (int i = 0; i < example.length(); i++) {
            if (checker.containsKey(example.charAt(i))) {
                u = false;
            } else {
                checker.put(example.charAt(i), true);
            }
        }

        return u;
    }
}
