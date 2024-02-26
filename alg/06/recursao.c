#include<stdio.h>

int tamanho(char str[]) {//nao recursivo 
	int t = 0;
	while(str[t] != '\0') 
	  t++;
	return t;  
}

int tamanhor(char str[]) {
   if (str[0] == '\0') 
   	  return 0;
   	return 1 + tamanhor(str+1); 
}

int tamanhor2(char str[], int t) {
   if (str[t] == '\0') 
   	  return t;
   	return tamanhor2(str, t+1); 
}

int numerosentre(int a, int b) {
	if (a == b) return 0;
	return 1 + numerosentre(a+1, b);
}

int somaentre(int a, int b) { //intervalo fechado
	if (a > b) return 0;
	return a + somaentre(a+1, b);
}

void inverte(char s[], int i, int f) {
   if (i >= f) return;
   char aux = s[i];
   s[i] = s[f];
   s[f] = aux;
   inverte(s, i+1,f-1);
}

void copia(char s1[], char s2[]) {//copia s2 para s1 (equivalente a funcao strcpy) 
  if (s2[0] == '\0') return;
  s1[0] = s2[0];
  copia(s1+1,s2+1);
}

void copia2(char s1[], char s2[], int p) {//copia s2 para s1 (equivalente a funcao strcpy) 
  if (s2[p] == '\0') return;
  s1[p] = s2[p];
  copia2(s1,s2,p+1);
}

void main() {

	char s[10] = "JOAO";
	char c[10], c2[10]; 

	printf("%s possui %d caracteres.\n", s, tamanho(s)); 
	printf("%s possui %d caracteres.\n", s, tamanhor(s)); 
	printf("%s possui %d caracteres.\n", s, tamanhor2(s, 0));
	
	copia(c, s);
	copia2(c2, s, 0);
	inverte(c2, 0, 3);
	
	printf("%s eh uma copia de %s.\n", c, s);
	printf("%s eh o inverso de %s.\n", c2, s);

	printf("Entre 3 e 7 ha %d numeros.\n", numerosentre(3, 7));
	printf("A soma dos numeros entre 3 e 7 eh %d.\n", somaentre(3, 7));

}