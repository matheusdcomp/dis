#include<stdio.h>

void main() {

    int a, b, c;
    printf("Digite 3 inteiros: ");
    scanf("%d %d %d", &a, &b, &c);

    if ( a < b && a < c)
        if (b < c)
          printf("\n%d %d %d\n", a, b, c);
        else
          printf("\n%d %d %d\n", a, c, b);
    
    else if ( b < a && b < c) 
        if (a < c)
          printf("\n%d %d %d\n", b, a, c);
        else
          printf("\n%d %d %d\n", b, c, a);
    
    else if ( c < b && c < a) 
        if (b < a)
          printf("\n%d %d %d\n", c, b, a);
        else
          printf("\n%d %d %d\n", c, a, b);
    

}