import java.util.Scanner;

public class RotateArrayByK {

    public static void rotateArray(int size, int[] arr, int k){
        k = k % size; // Important to avoid overflow
        int[] result = new int[size];
        int j = 0;

        for(int i = size - k; i < size; i++){ // Copy last k elements first
            result[j++] = arr[i];
        }

        for(int i = 0; i < size - k; i++){ // Copy first (size-k) elements
            result[j++] = arr[i];
        }
         
        System.out.println("Rotated Array:\n");
        for(int i = 0; i < size; i++){
            System.out.println(result[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array: ");
        int n = sc.nextInt();

        System.out.println("Enter value of k (non-negative): ");
        int k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:\n");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        rotateArray(n, arr, k);

        sc.close();

    }
}

