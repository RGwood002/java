import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        int input = 100;
        fizzbuzz(input);
    }

    public static List<String> fizzbuzz(int input) {
        String[] imp = new String[input];

        for (int i = 1; i < input + 1; i++) {
            if (i % 15 == 0) {
                imp[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                imp[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                imp[i - 1] = "Buzz";
            } else {
                imp[i - 1] = Integer.toString(i);
            }

        }

        List<String> in = new ArrayList<String>(Arrays.asList(imp));
        return in;
    }

}
