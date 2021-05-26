public class urlify {
    public static void main(String[] args) {
        String test = "Mr John Smith           ";
        System.out.println(url(test));
    }

    public static String url(String test) {
        StringBuilder newURL = new StringBuilder();

        String newTest = test.trim();

        for (int i = 0; i < newTest.length(); i++) {
            if (Character.isWhitespace(newTest.charAt(i))) {
                newURL.append("%20");
            } else {
                newURL.append(newTest.charAt(i));
            }
        }

        return newURL.toString();
    }
}
