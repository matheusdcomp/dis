#include<stdio.h>

void main() {

    int a, b, m = 0;
    printf("Digite dois inteiros, um menor e  outro maior: ");
    scanf("%d %d", &a, &b);
    
    for (int c = 1; c <= b; c++)
        m = m + a;

    printf("%d x %d = %d\n", a, b, m);     

}