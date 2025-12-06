#include <stdio.h>

void sort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int findIntersection(int a[], int n1, int b[], int n2, int result[]) {
    int k = 0;

    sort(a, n1);
    sort(b, n2);

    int i = 0, j = 0;

    // Two-pointer technique
    while (i < n1 && j < n2) {
        if (a[i] == b[j]) {
            result[k++] = a[i]; // store common element
            i++;
            j++;
        }
        else if (a[i] < b[j]) {
            i++;
        }
        else {
            j++;
        }
    }

    return k;
}

void main() {
    int n1, n2;

    printf("Enter size of array 1: ");
    scanf("%d", &n1);
    int a[n1];

    printf("Enter elements of array 1:\n");
    for (int i = 0; i < n1; i++){
        scanf("%d", &a[i]);
    }

    printf("Enter size of array 2: ");
    scanf("%d", &n2);
    int b[n2];

    printf("Enter elements of array 2:\n");
    for (int i = 0; i < n2; i++){
        scanf("%d", &b[i]);
    }

    int result[(n1 < n2) ? n1 : n2];  // max possible intersection size

    int size = findIntersection(a, n1, b, n2, result);

    printf("\nIntersection: ");
    for (int i = 0; i < size; i++){
        printf("%d ", result[i]);
    }
}