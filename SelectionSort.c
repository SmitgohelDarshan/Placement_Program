#include <stdio.h>

void selectionSort(int arr[], int size){
    for(int i = 0; i < size-1; i++){
        int minIdx = i;

        for(int j = i+1; j < size; j++){
            if(arr[minIdx] > arr[j]){
                minIdx = j;
            }
        }

        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }

    printf("Sorted Array:\n");
    for(int i = 0; i < size; i++){
        printf("%d ",arr[i]);
    }
}

void main(){
    int n; 
    printf("Enter size of an array: ");
    scanf("%d",&n);

    int arr[n];
    printf("Enter elements:\n");
    for(int i = 0; i < n; i++){
        scanf("%d",&arr[i]);
    }

    selectionSort(arr, n);
}