import java.util.Scanner;

public class P28_decodePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter encoded string: ");
        String str = sc.next();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');   
            } else {
                if (count == 0) {
                    count = 1;
                }

                for (int j = 0; j < count; j++) {
                    System.out.print(ch);
                }    
                count = 0;
            }
        }

        sc.close();
    }
}
