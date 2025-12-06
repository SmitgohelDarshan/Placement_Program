#include <stdio.h>
#include <math.h>

int decimalToOctal(int decimal) {
    int octal = 0, i = 1;

    while (decimal != 0) {
        int remainder = decimal % 8;
        octal += remainder * i;
        decimal /= 8;
        i *= 10;
    }
    return octal;
}

int octalToDecimal(int octal) {
    int decimal = 0, i = 0;

    while (octal != 0) {
        int digit = octal % 10;
        decimal += digit * pow(8, i);
        octal /= 10;
        i++;
    }
    return decimal;
}

void main() {
    int choice, num;

    printf("1. Decimal to Octal\n");
    printf("2. Octal to Decimal\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    if (choice == 1) {
        printf("Enter Decimal number: ");
        scanf("%d", &num);
        printf("Octal: %d", decimalToOctal(num));

    } else if (choice == 2) {
        printf("Enter Octal number: ");
        scanf("%d", &num);
        printf("Decimal: %d", octalToDecimal(num));

    } else {
        printf("Invalid Choice!");
    }
}