import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int start[] = new int[n];

        // Initial values of the first column
        for (int i = 0; i < n; i++) {
            start[i] = i + 1;
        }

        for (int row = 0; row < n; row++) {
            int val = start[row];

            for (int col = 0; col <= row; col++) {
                System.out.print(val + " ");
                val += (n - col - 1);
            }
            System.out.println();
        }

        sc.close();
    }
}