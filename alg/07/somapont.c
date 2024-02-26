#include <stdio.h>


void main() {
	int a = 5, *p = &a;
	printf("\n%x + 1 = %x\n", p, p+1);
	printf("\n%x - 1 = %x\n", p, p-1);	
}
