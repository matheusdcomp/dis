#include<stdio.h>

typedef struct {
    float x, y;
} ponto;

typedef struct {
    float raio;
    ponto centro;
} circulo;

void main() {
    
    circulo c;
    
    printf("Digite o raio do circulo: ")
    scanf( "%f", &c.raio );
    printf("Digite as coordenadas do centro do circulo: ")
    scanf( "%f %f", &c.centro.x, &c.centro.y );   

    printf( "Centro: (%.1f,%.1f)\n", c.centro.x, c.centro.y );
    printf( "Raio: %.1f", c.raio );

}