#include <stdio.h>
#include <math.h>

int isAutomorphic(int num) {
    int square = num * num;

    int digits = 0, temp = num;
    while (temp > 0) {
        digits++;
        temp /= 10;
    }

    int divisor = pow(10, digits);

    if (square % divisor == num)
        return 1;
    else
        return 0;
}

void main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isAutomorphic(num))
        printf("%d is an Automorphic number", num);
    else
        printf("%d is not an Automorphic number", num);
}