#include <stdio.h>
#include <math.h>

void isKaprekar(int num) {
    if (num == 1) return 1; 
    
    int square = num * num;
    int digits = 0;
    int temp = square;
    
    while (temp > 0) {
        digits++;
        temp /= 10;
    }
    
    for (int i = 1; i < digits; i++) {
        int divisor = pow(10, i);
        int part1 = square / divisor;
        int part2 = square % divisor;
        
        if (part1 > 0 && part2 > 0 && (part1 + part2 == num)) {
            return 1;
        }
    }
}

void main() {
    int num;
    
    printf("Enter a number: ");
    scanf("%d", &num);
    
    if (num < 0) {
        printf("Please enter a non-negative number");
    } else if (isKaprekar(num)) {
        printf("%d is a Kaprekar number", num);
    } else {
        printf("%d is not a Kaprekar number", num);
    }
}