import java.util.Scanner;

public class searchRecursive {

    public static boolean isInArray(int[] arr, int n, int m) {
        if (n == 0) {
            return false;
        }
        if (arr[n - 1] == m) {
            return true;
        }
        return isInArray(arr, n - 1, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        int m = sc.nextInt();

        if (isInArray(arr, n, m)) {
            System.out.println("Element is present in array");
        } else {
            System.out.println("Element is not present in array");
        }

        sc.close();
    }
}