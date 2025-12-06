#include <stdio.h>

int isUgly(int n) {
    if (n <= 0) return 0;
    if (n == 1) return 1;

    while (n % 2 == 0) n /= 2;
    while (n % 3 == 0) n /= 3;
    while (n % 5 == 0) n /= 5;

    return (n == 1);
}

void main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isUgly(num))
        printf("%d is an Ugly number", num);
    else
        printf("%d is not an Ugly number", num);
}