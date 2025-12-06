#include <stdio.h>

void rotateArray(int size, int arr[], int k){
    k = k % size;  // Important to avoid overflow
    int result[size];
    int j = 0;

    for(int i = size - k; i < size; i++){ // Copy last k elements first
        result[j++] = arr[i];  
    }
    for(int i = 0; i < size - k; i++){ // Copy first (size-k) elements
        result[j++] = result[i];
    }

    printf("Rotated Array:\n");
    for(int i = 0; i < size; i++){
        printf("%d", result[i]);
    }
}

void main(){
    int n, k;
    printf("Enter size of an array:");
    scanf("%d",&n);

    printf("Enter value of k (non-negative):");
    scanf("%d",&k);

    int arr[n];
    printf("Enter elements:\n");
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    rotateArray(n, arr, k);
}