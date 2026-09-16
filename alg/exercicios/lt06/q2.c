/*
Usando o registro Ponto da questão anterior, crie um registro 
chamado Retângulo, que contém o ponto superior esquerdo e um 
ponto inferior direito.  Faça  um  programa  que  solicita  
do  usuário  os  dados  de  um retângulo e imprima a área, o 
comprimento da diagonal e o perímetro desse retângulo.
*/


#include<stdio.h>
#include<math.h>

typedef struct {
   float x, y;
} ponto;

typedef struct {
    ponto se, id;
} retangulo;

void main() {

    retangulo r;
    printf("Digite os dados do retangulo:\n");
    printf("Coordenadas do ponto superior esquerdo: ");
    scanf("%f %f", &r.se.x, &r.se.y);
    printf("Coordenadas do ponto inferior direito: ");
    scanf("%f %f", &r.id.x, &r.id.y);

    float altura = r.se.y - r.id.y;
    float base = r.id.x - r.se.x;
    float area = base * altura;
    float diagonal = sqrt(pow(base,2) + pow(altura,2)); 
    float perimetro = altura*2 + base*2;

    printf("\nAltura: %f", altura);
    printf("\nBase: %f", base);
    printf("\nArea: %f", area);
    printf("\nDiagonal: %f", diagonal);
    printf("\nPerimetro: %f\n", perimetro);
    
}


