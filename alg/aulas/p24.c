#include<stdio.h>

int fatorial(int n) {
  int f = 1;
  for (int i = n; i > 1; i-- ) 
    f *= i;
  return f;
}

int fat(int n) {
  if (n == 0 || n == 1) return 1;
  return n * fat(n-1);
}

int tamanho(char s[]) {
  int t = -1;
  while (s[++t] != '\0');
  return t;
}

int tam(char s[]) {
  if (s[0] == '\0') return 0;
  return 1 + tam(&s[1]);
}

int soma(int s[], int t) {
  if (t == 0) return 0;
  return s[t-1] + soma(s, t-1);
}
//[5,6,7] t = 3
//7 + soma([5,6,7], t=2)  
//    6 + soma([5,6,7], t=1)
//        5 + soma([5,6,7], t=0)
//            0


//1 2 3 4 5 6 7 8 ...  
//0 1 1 2 3 5 8 13 ...

int fib(int p) {
  if (p == 1) return 0;
  if (p == 2) return 1;
  return fib(p-1) + fib(p-2);
}



/*
tam("arara\0")
1 + tam("rara\0")
    1 + tam("ara\0")
        1 + tam("ra\0")
            1 + tam("a\0")
                1 + tam("\0")
                    0
*/




void main() {
  int x;
  char str[100];
  printf("Digite um inteiro positivo: ");
  scanf("%d", &x);
  printf("Digite uma string: ");
  scanf("%s", str);
  printf("\nFatorial de %d: %d", x, fat(x));
  printf("\nTamanho de '%s': %d", str, tamanho(&str[0]));
}

/*
END NOME    VALOR 
E1  x       3
E2  n(f3)   3
E3  n(f2)   2
E4  n(f1)   1

6
3 * 2
    2 * 1
        1
*/