import java.util.Scanner;

public class ArrayIntersection {

    public static void sort(int[] arr, int n){
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int[] intersection(int[] a, int n1, int[] b, int n2){
        sort(a, n1);
        sort(b, n2);

        int[] temp = new int[Math.min(n1, n2)];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (a[i] == b[j]) {
                temp[k++] = a[i];
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        
        System.out.println("Enter elements of array 1:");
        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        
        System.out.println("Enter size of array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        
        System.out.println("Enter elements of array 2:");
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        int[] result = intersection(arr1, n1, arr2, n2);

        System.out.println("Intersection:");
        for(int num : result){
            System.out.print(num + " ");
        }

        sc.close();
    }
}