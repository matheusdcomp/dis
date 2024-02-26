#include<stdio.h>

void main() {

    const int TAM = 1000; 
    float a[TAM], media = 0;
    
    for (int i = 0; i < TAM; i++) {
        printf("Digite um numero: ");
        scanf("%f", &a[i]);
        media += a[i];
    }
    media /= TAM;
    printf("Media: %f\n", media);

}