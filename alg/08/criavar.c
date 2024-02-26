void main() {
    char op;
    int* p;
    while(1) {
        printf("\nQuer criar uma variavel (s/n): ");
        scanf("%c", &op);
        if (op == 'n') break;
        p = (int*) calloc(1,sizeof(int));
        printf("Digite o valor da variavel criada: ");
        scanf("%d", p); 
        printf("\nValor da variavel: %d", *p);
        free(p);
    }
}