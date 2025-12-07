#include <stdio.h>

void reverseArray(int size, int arr[]){
    int left = 0, right = size - 1;
    //1, 4, 3, 2, 6, 5 --> 5, 6, 2, 3, 4, 1
    while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++; right--;
    }

    printf("Reverse Array:\n");
    for(int i = 0; i < size; i++){
        printf("%d", result[i]);
    }
}

void main(){
    int n, k;
    printf("Enter size of an array:");
    scanf("%d",&n);

    int arr[n];
    printf("Enter elements:\n");
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    reverseArray(n, arr);
}