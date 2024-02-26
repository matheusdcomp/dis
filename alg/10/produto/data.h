///////////////////////////////////////////////////////////////////////////////////
// Arquivo biblioteca
// #ifndef, #define e #endif servem para impedir que,
// caso este arquivo de biblioteca seja incluído em um programa mais de uma vez,
// haja uma duplicidade de suas definições. 
///////////////////////////////////////////////////////////////////////////////////


#ifndef DATA_H 
#define DATA_H


typedef struct { 
	int dia,mes,ano;
} Data;

void imprimeData(Data);

#endif