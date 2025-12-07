import java.util.Scanner;

public class reverseArray {

    public static  void reverseArr(int[] arr){
        int left = 0, right = arr.length - 1;

        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array:");
        for (int num : arr){
            System.out.print(num + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:\n");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        reverseArr(arr);

        sc.close();
    }
}
