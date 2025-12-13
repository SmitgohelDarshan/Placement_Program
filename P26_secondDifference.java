import java.util.Scanner;

public class P26_secondDifference {

    public static void sort(int[] arr, int size){
        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort(arr, n);

        int secondSmallest = 0, secondLargest = 0;

        // second smallest
        for(int i = 1; i < n; i++) {
            if(arr[i] != arr[0]) {
                secondSmallest = arr[i];
                break;
            }
        }

        // second largest
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] != arr[n - 1]) {
                secondLargest = arr[i];
                break;
            }
        }

        System.out.println("Difference: " + (secondLargest - secondSmallest));

        sc.close();
    }
}