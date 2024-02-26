#include <stdio.h>

typedef struct {
	int i;
	double d;
} num;

void main() {

  num n = { 10, 2.645 };
  FILE *arq = fopen("struct.txt", "wb");
  fwrite(&n, sizeof(num), 1, arq);
  fclose(arq);

  num x;
  arq = fopen("struct.txt", "rb");
  fread(&x, sizeof(num), 1, arq);
  fclose(arq);

  printf("\n%d   %lf\n", x.i, x.d);
}