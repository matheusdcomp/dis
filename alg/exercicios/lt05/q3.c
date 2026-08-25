#include<stdio.h>

void main() {
	int a, b, p = 2, mmc = 1;
	printf("Digite dois inteiros: ");
	scanf("%d %d", &a, &b);
	
	while ( a > 1 || b > 1 ) {

        if ( (a % p == 0) || (b % p == 0) ) { //acha um primo que divide A ou B
           printf( "\n %d, %d | %d", a, b, p);
           mmc *= p;
           if (a % p == 0) a /= p;
           if (b % p == 0) b /= p;
        }
        else { //se P não dividir A nem B, armazena nele o proximo número primo
            int primo;
            do {
            	primo = 1;
            	p++;
              	for (int d = 2; d <= p / 2; d++)
              		if (p % d == 0) {
              			primo = 0; 
              			break;
              		}
            } while (!primo);
        }
    }
	
	printf("\n\n MMC: %d\n", mmc);
}