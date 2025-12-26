#include <stdio.h>
#include <ctype.h>
void main(){
    char str[100];
    printf("Enter encoded string: ");
    scanf("%s", str);

    int count = 0;
    for (int i = 0; i < str[i] != '\0'; i++) {
        if(isdigit(str[i])) {
            count = count * 10 + (str[i] - '0');
        } else {
            if (count == 0) {
                count = 1;
            }

            for (int j = 0; j < count; j++) {
                printf("%c", str[i]);
            }

            count = 0;
        }
    }
}