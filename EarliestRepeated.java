import java.util.*;

public class EarliestRepeated {

    public static char earliestRepeated(String s) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (set.contains(ch)) {
                return ch;
            } else {
                set.add(ch);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        char ans = earliestRepeated(s);

        if (ans != '\0') {
            System.out.println("Earliest Repeated character: " + ans);
        } else {
            System.out.println("No Repeated character");
        }

        sc.close();
    }
}
