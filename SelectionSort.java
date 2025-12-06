import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr, n);

        sc.close();
    }
}