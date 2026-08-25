#include<stdio.h>

void main() {

    int x[10], y[10];

    for (int i = 0; i < 10; i++) {
        printf("Digite o %do elemento: ", i+1);
        scanf("%d", &x[i]);
        if (i % 2 == 0) 
            y[i] = x[i] / 2;
        else
            y[i] = x[i] * 3;
            
    }

    for (int i = 0; i < 10; i++) 
        printf("x[%d] = %d\t\ty[%d] = %d\n", i, x[i], i, y[i]);
    
}