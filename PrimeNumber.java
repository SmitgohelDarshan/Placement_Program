import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) { //faster because -> O(√n)
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num))
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is not a Prime number");

        sc.close();
    }
}