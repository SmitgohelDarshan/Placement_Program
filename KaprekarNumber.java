import java.util.Scanner;

public class KaprekarNumber {
    
    public static boolean isKaprekar(int num) {
        if (num == 1) return true;
        
        long square = (long) num * num;
        String squareStr = String.valueOf(square); //String squareStr = square + "";
        int digits = squareStr.length();
        
        for (int i = 1; i < digits; i++) {
            String part1Str = squareStr.substring(0, i);
            String part2Str = squareStr.substring(i);
            
            long part1 = Long.parseLong(part1Str);
            long part2 = Long.parseLong(part2Str);
            
            if (part1 > 0 && part2 > 0 && (part1 + part2 == num)) {
                return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Please enter a non-negative number");
        } else if (isKaprekar(num)) {
            System.out.println(num + " is a Kaprekar number");
        } else {
            System.out.println(num + " is not a Kaprekar number");
        }
        scanner.close();
    }
}