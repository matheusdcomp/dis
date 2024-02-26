#include<stdio.h>

void main() {

	float a = 5.0, b = 2.0;
	float *pa = &a, *pb = &b;
	float r1 = a * b;
	float r2 = *pa * *pb;
	printf("\n r1: %f \n r2: %f \n", r1, r2);

}