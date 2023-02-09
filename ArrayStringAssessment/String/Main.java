import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        System.out.println(moveSpecialCharacters(str));
    }

    public static String moveSpecialCharacters(String str) {

        String specialCh = "[a-zA-Z0-9\\s+]";
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.valueOf(ch).matches(specialCh)) {
                s1 += ch;
            } else {
                s2 += ch;
            }
        }

        String s = s1 + s2;

        return s.replace(" ", "");
    }
}