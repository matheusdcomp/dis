#include <stdio.h>
#include <stdlib.h>

void main() {
    int a = 54325;
    char str[20];
    itoa(a, str, 2);  //o 2 indica binário
    printf("Binario = %s\n", str); 
    itoa(a, str, 10);   //o 10 indica decimal
    printf("Decimal = %s\n", str); 
    itoa(a, str, 16);   //o 16 indica Hexadecimal
    printf("Hexadecimal = %s\n", str);
}
