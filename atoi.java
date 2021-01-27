public class atoi {
    public static void main(String[] args) {
        String input = "-00001";
        aoti(input);
    }

    public static int aoti(String s) {
        int clean = 0;
        int sign = 1;
        int base = 0;
        char[] mod = s.toCharArray();

        for (char c : mod) {
            System.out.println(c);
        }

        int i = 0;
        while (Character.isWhitespace(mod[i])) {
            i++;
        }

        if (mod[i] == '-') {
            sign = -1;
            i++;
        }
        if (mod[i] == '+') {
            sign = 1;
            i++;
        }

        return clean;
    }
}
