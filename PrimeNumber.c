#include <stdio.h>

int isPrime(int n) {
    if (n <= 1) return 0;

    for (int i = 2; i * i <= n; i++) { //faster because i <= √n -> O(√n) 
        if (n % i == 0)
            return 0;
    }
    return 1;
}

void main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isPrime(num))
        printf("%d is a Prime number", num);
    else
        printf("%d is not a Prime number", num);
}