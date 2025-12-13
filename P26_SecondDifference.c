#include <stdio.h>

void sort(int arr[], int size){
    for(int i = 0; i < size - 1; i++){
        for(int j = 0; j < size - i - 1; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void main(){
    int n;
    printf("Enter the size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements:\n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    sort(arr, n);

    int secondSmallest, secondLargest;

    // second smallest
    for(int i = 1; i < n; i++){
        if(arr[i] != arr[0]){
            secondSmallest = arr[i];
            break;
        }
    }

    // second largest
    for(int i = n - 2; i >= 0; i--){
        if(arr[i] != arr[n - 1]){
            secondLargest = arr[i];
            break;
        }
    }

    printf("Difference: %d", secondLargest - secondSmallest);
}