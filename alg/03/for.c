#include<stdio.h>

void main() {
	int n, s = 0;
	printf("Digite um inteiro: ");
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		s = s + i;
	}
	printf("\nSoma de 1 ate %d: %d\n", n, s);
	}
}