
#include <stdio.h>

 
int main() {

	int qtd;
	float media = 0;
	printf("Quantos numeros deseja digitar: ");
	scanf("%d", &qtd);

	float *array = (float*) malloc(qtd * sizeof(float));
    
    for (int i = 0; i < qtd; i++) {
    	printf("Digite o %do numero: ", i+1);
    	scanf( "%f", (array+i));
    	media += array[i]; 
    }

    media /= qtd; 
    
    printf("Media: %f", media);

}
