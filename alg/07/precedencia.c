#include <stdio.h>


void main() {
	int a = 5, b = 10, *pa = &a, *pb = &b;
	printf("\na = %d; b = %d; pa = %x; pb = %x\n", a, b, pa, pb);

	int s = *pa + *pb;
	printf("\n*pa + *pb = %d\n", s);
	 
	*pa++;
	(*pb)++;
	printf("\n*pa++   =>  a = %d; pa = %x\n", a, pa);
	printf("\n(*pb)++ =>  b = %d; pb = %x\n", b, pb);
}
