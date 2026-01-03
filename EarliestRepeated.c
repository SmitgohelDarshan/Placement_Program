#include <stdio.h>
#include <string.h>

char earliestRepeated(char s[]) {
    int freq[256] = {0};
    int n = strlen(s);
    
    for (int i = 0; i < n; i++) {
        freq[s[i]]++;

        if (freq[s[i]] == 2) { // Second occurrence
            return s[i];
        }
    }
    return '\0'; // No repeated character
}

void main(){
    char str[100];

    printf("Enter string: ");
    scanf("%s", str);

    char ans = earliestRepeated(str);

    if(ans != '\0') {
        printf("Earliest repeated character: %c\n", ans);
    }
    else {
        printf("No repeated character\n");
    }
}