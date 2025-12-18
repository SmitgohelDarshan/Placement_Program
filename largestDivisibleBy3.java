import java.util.Scanner;

public class largestDivisibleBy3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of digits: ");
        int n = sc.nextInt();

        int[] freq = new int[10];
        int sum = 0;

        System.out.println("Enter digits: ");
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            freq[d]++;
            sum += d;
        }

        int rem = sum % 3;

        /*
        Why loop starts at 1 and 2?
        Remember digit classification:
        digit % 3	digits
        0	        0, 3, 6, 9
        1	        1, 4, 7
        2	        2, 5, 8
        */

        // Remove digits
        if(rem == 1){
            for(int i = 1; i <= 9; i += 3){
                if(freq[i] > 0){
                    freq[i]--;
                    break;
                }
            }
        }
        else if(rem == 2){
            for(int i = 2; i <= 9; i += 3){
                if(freq[i] > 0){
                    freq[i]--;
                    break;
                }
            }
        }

        System.out.print("Largest number divisible by 3: ");
        for (int i = 9; i >= 0; i--) {
            while (freq[i]-- > 0) {
                System.out.print(i);
            }
        }

        sc.close();
    }
}