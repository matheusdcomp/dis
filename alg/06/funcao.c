#include<stdio.h>

void main(void);
int soma(int, int);
int fatorial(int);

void main() {
    int x;
    printf("\nDigite um inteiro: ");
    scanf("%d", &x);

    int s = soma(x,x);
    int r = fatorial(s);
    
    printf("\nO fatorial de %d eh %d", s, r);

}

int soma(int a, int b) {
    return a + b;
}

int fatorial(int n) {
    int f = 1;
    for( int i = 1; i <= n; i++)
        f = f * i;
    return f;    
}
