#include<stdio.h>

void main() {   

    int s;
    
    printf("Digite o tempo em segundos: ");
    scanf("%d", &s);

    int h = s / 3600;
    int aux = s % 3600;
    int m = aux / 60;
    aux = aux % 60;

    printf("%d segundos equivalem a %dh %dm e %ds\n", 
        s, h, m, aux );
    
}