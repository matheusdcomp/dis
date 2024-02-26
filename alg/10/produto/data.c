#include <stdio.h>
#include "data.h" 

void imprimeData(Data x) {
	printf("%02i/%02i/%04i", x.dia, x.mes, x.ano);
}
