#include <stdio.h>

int isPronic(int num) {
    if (num < 0) return 0;

    for (int i = 0; i * (i + 1) <= num; i++) {
        if (i * (i + 1) == num)
            return 1;
    }

    return 0;
}

void main() {
    int num;

    printf("Enter a number: ");
    scanf("%d", &num);

    if (isPronic(num))
        printf("%d is a Pronic number", num);
    else
        printf("%d is not a Pronic number", num);
}