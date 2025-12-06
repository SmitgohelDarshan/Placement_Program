import java.util.Scanner;

public class AutomorphicNumber {

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;

        while (temp > 0) {
            if (temp % 10 != square % 10)
                return false;

            temp /= 10;
            square /= 10;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isAutomorphic(num))
            System.out.println(num + " is an Automorphic number");
        else
            System.out.println(num + " is not an Automorphic number");

        sc.close();
    }
}