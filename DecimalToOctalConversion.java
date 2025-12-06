import java.util.Scanner;

public class DecimalToOctalConversion {

    public static int decimalToOctal(int decimal) {
        int octal = 0, i = 1;

        while (decimal != 0) {
            int remainder = decimal % 8;
            octal += remainder * i;
            decimal /= 8;
            i *= 10;
        }
        return octal;
    }

    public static int octalToDecimal(int octal) {
        int decimal = 0, i = 0;

        while (octal != 0) {
            int digit = octal % 10;
            decimal += digit * Math.pow(8, i);
            octal /= 10;
            i++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Decimal to Octal");
        System.out.println("2. Octal to Decimal");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter Decimal number: ");
            int num = sc.nextInt();
            System.out.println("Octal: " + decimalToOctal(num));

        } else if (choice == 2) {
            System.out.print("Enter Octal number: ");
            int num = sc.nextInt();
            System.out.println("Decimal: " + octalToDecimal(num));

        } else {
            System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}