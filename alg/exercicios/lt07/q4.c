/*
Crie uma função que recebe um vetor de inteiros e ordene 
os seus elementos na ordem crescente. Dica: utilize o algoritmo 
Selection Sort para ordenar o vetor. Para isso, encontre o menor 
valor do vetor e posicione-o na primeira posição. Em seguida, 
repita esse processo para encontrar o segundo menor e colocá-lo 
na segunda posição e assim sucessivamente. Para facilitar, 
crie uma função que recebe um vetor de inteiros e uma posição 
inicial e retorna a posição que possui o menor elemento a partir 
da posição inicial informada. Crie um programa que solicite os 
elementos do vetor de tamanho 10 e o imprima de forma ordenada.
*/

#include<stdio.h>

#define TAM 10

int indiceDoMenor(int vetor[], int i) {
	int menor = i;
	while(++i < TAM)
		if (vetor[i] < vetor[menor])
			menor = i;
	return menor;	
}

void selectionSort(int vetor[]) {
	for (int i = 0; i < TAM-1; i++) {
		int menor = indiceDoMenor(vetor, i);
		int aux = vetor[i];
		vetor[i] = vetor[menor];
		vetor[menor] = aux;	
	}
}

void main() {
	int v[TAM];
	for (int i = 0; i < TAM; i++) {
		printf("Digite o valor do %do elemento: ", i+1);
		scanf("%d", &v[i]);
	}
	selectionSort(v);
	printf("\nVetor ordenado: ");
	for (int i = 0; i < TAM; i++)
		printf("%d ", v[i]);	
}