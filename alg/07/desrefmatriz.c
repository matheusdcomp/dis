#include <stdio.h>

void main() {
	int m[3][3] = {{1,2,3},{4,5,6},{7,8,9}};
	int x = *(*(m+2)+2); 
	
	printf("\nm: %x", m);
	printf("\nm+12+8: %x", (*(m+2)+2));
	printf("\nm[2,2]: %d", x);

}