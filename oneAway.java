//rethink apporach tomorrow

public class oneAway {
    public static void main(String[] args) {
        String test = "pale";
        String test2 = "ple";

    }

    public static boolean oneEdit(String a, String b) {
        boolean oneEdit = true;
        int edits = 1;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    if (edits == 0) {
                        oneEdit = false;
                    }
                    edits--;
                }
            }
        } else {
            if (a.length() - b.length() > 1) {
                oneEdit = false;
            } else {

            }
        }

        return oneEdit;
    }
}
