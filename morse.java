import java.util.*;

public class morse {
    public static void main(String[] args) {
        String[] input = { "gin", "zen", "gig", "msg" };
        System.out.println(uniqueMorseRepresentations(input));
    }

    public static int uniqueMorseRepresentations(String[] words) {

        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z" };
        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        HashMap<String, String> code = new HashMap<String, String>();
        Set<String> translated = new HashSet<String>();

        for (int i = 0; i < 26; i++) {
            code.put(alphabet[i], morse[i]);
        }

        for (int i = 0; i < words.length; i++) {
            String input = words[i];
            String tran = "";
            char[] arr = input.toCharArray();
            for (int j = 0; j < arr.length; j++) {
                tran = tran + code.get(String.valueOf(arr[j]));
            }
            translated.add(tran);
        }

        return translated.size();
    }
}
