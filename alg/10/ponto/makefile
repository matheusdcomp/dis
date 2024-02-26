all: pnt

pnt: pontomain.o ponto.o
	gcc -o pnt pontomain.o ponto.o

pontomain.o: pontomain.c
	gcc -c pontomain.c

ponto.o: ponto.c
	gcc -c ponto.c