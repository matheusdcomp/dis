CC=gcc
all: produtomain

p02: produtomain.o produto.o data.o
	$(CC) -o produtomain produtomain.o produto.o data.o

p02.o: produtomain.c
	$(CC) -c produtomain.c

Produto.o: produto.c
	$(CC) -c produto.c

Data.o: data.c
	$(CC) -c data.c