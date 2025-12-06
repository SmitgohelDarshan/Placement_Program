import java.util.Scanner;

public class PronicNumber {

    public static boolean isPronic(int num) {
        if (num < 0) return false;

        for (int i = 0; i * (i + 1) <= num; i++) {
            if (i * (i + 1) == num)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPronic(num))
            System.out.println(num + " is a Pronic number");
        else
            System.out.println(num + " is not a Pronic number");

        sc.close();
    }
}