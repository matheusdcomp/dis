/*
Usando o registro Retângulo e Ponto das questões anteriores, 
faça um programa que solicita os dados de um retângulo e um 
ponto e informe se esse ponto está ou não inserido dentro do 
retângulo.
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
    ponto p;

    printf("Digite os dados do retangulo R:\n");
    printf("Coordenadas do ponto superior esquerdo: ");
    scanf("%f %f", &r.se.x, &r.se.y);
    printf("Coordenadas do ponto inferior direito: ");
    scanf("%f %f", &r.id.x, &r.id.y);
    printf("\nDigite as coordenadas do ponto P: ");
    scanf("%f %f", &p.x, &p.y);

    int dentro = ( r.se.x <= p.x && p.x <= r.id.x ) &&
                 ( r.id.y <= p.y && p.y <= r.se.y );

    printf("\n%s %s\n", 
        "O ponto P esta dentro do retangulo R?",
        dentro ? "sim" : "nao" );
    
}


