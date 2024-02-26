
#include "ponto.h"

Ponto soma(Ponto a, Ponto b) {
	a.x = a.x + b.x;
	a.y = a.y + b.y;
	return a;
}

Ponto sub(Ponto a, Ponto b) {
	a.x = a.x - b.x;
	a.y = a.y - b.y;
	return a;
}