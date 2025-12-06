#include <stdio.h>

void main() {
    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    int start[n];

    // First column starting values
    for (int i = 0; i < n; i++) {
        start[i] = i + 1;
    }

    for (int row = 0; row < n; row++) {
        int val = start[row];

        for (int col = 0; col <= row; col++) {
            printf("%d ", val);
            val += (n - col - 1);
        }
        printf("\n");
    }
}