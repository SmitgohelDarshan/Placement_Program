#include <stdio.h>

int isInarray(int arr, int n, int m) {
    if (n == 0)     return 0;
    if (arr[n - 1] == m)    return 1;
    
    return isInarray(arr, n - 1, m);
}

void main(){
    int n, m;
    printf("Enter size of an array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter array elements:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Enter element to search: ");
    scanf("%d", &m);

    if (isInarray(arr, n, m)) {
        printf("Element is present in array");
    } else {
        printf("Element is not present in array");
    }
}