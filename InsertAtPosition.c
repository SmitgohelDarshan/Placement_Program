#include <stdio.h>

int insertElement(int arr[], int n, int pos, int value){
    for(int i = n-1; i >= pos; i--){
        arr[i+1] = arr[i];
    }
    arr[pos] = value;
    return n+1;
}

void main(){
    int n, pos, value;
    
    printf("Enter number of elements: ");
    scanf("%d",&n);

    int arr[n+1];

    printf("Enter array elements:\n");
    for(int i = 0; i < n; i++){
        scanf("%d", &arr[i]);
    }

    printf("Enter position to insert: ");
    scanf("%d", &pos);

    printf("Enter value to insert: ");
    scanf("%d", &value);

    n = insertElement(arr, n, pos, value);

    printf("Array after insertion:\n");
    for(int i = 0; i < n; i++){
        printf("%d ", arr[i]);
    }
}