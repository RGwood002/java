public class goalParcer {
    public static void main(String[] args) {
        String input = "G()(al)";
        System.out.println(interpret(input));
    }

    public static String interpret(String command) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            System.out.println(command.charAt(i));
            if ((command.charAt(i) != '(') && (command.charAt(i) != ')')) {
                out.append(command.charAt(i));
            } else if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    out.append('o');
                    i++;
                }
            }
        }

        return out.toString();
    }

}
