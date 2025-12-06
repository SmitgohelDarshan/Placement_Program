import java.util.Scanner;

public class InsertAtPosition {

    public static int insertElement(int[] arr, int n, int pos, int value) {
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = value;
        return n + 1;  // new size
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n+1]; // extra space

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int value = sc.nextInt();

        n = insertElement(arr, n, pos, value);

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}