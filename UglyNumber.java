import java.util.Scanner;

public class UglyNumber {

    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        return (n == 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isUgly(num))
            System.out.println(num + " is an Ugly number");
        else
            System.out.println(num + " is not an Ugly number");

        sc.close();
    }
}