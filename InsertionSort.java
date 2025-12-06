import java.util.Scanner;

public class InsertionSort {
    
    private static void insertionSort(int[] arr, int size){
        int j, key;
        for(int i = 1; i < size; i++){
            key = arr[i];
            j = i-1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println("Sorted Array:\n");
        for(int i = 0; i < size; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:\n");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        insertionSort(arr, n);

        sc.close();
    }
}
