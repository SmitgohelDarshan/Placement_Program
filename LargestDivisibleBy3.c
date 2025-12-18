#include <stdio.h>
void main(){
    int n;
    printf("Enter number of digis: ");
    scanf("%d", &n);

    int freq[10];
    int sum = 0, d;
    printf("Enter digits:\n");
    for(int i = 0; i < n; i++){
        scanf("%d", &d);
        freq[d]++;
        sum += d;
    }

    int rem = sum % 3;

    // Remove Digits
    if(rem == 1){
        for(int i = 1; i <= 9; i+=3){
            if(freq[i] > 0){
                freq[i]--;
                break;
            }
        }
    }
    else if(rem == 2){
        for(int i = 2; i <= 9; i += 3){
            if(freq[i] > 0){
                freq[i]--;
                break;
            }
        }
    }

    printf("Largest number divisible by 3: ");
    for(int i = 9; i >= 0; i--){
        while(freq[i]-- > 0){
            printf("%d", i);
        }
    }
}